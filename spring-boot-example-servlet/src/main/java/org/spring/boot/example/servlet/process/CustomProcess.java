package org.spring.boot.example.servlet.process;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedOptions;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName CustomProcess
 * @Author huyaxi
 * @DATE 2020/3/6 15:03
 */
@CustomService(Process.class)
@SupportedOptions("debug")
public class CustomProcess extends AbstractProcessor {

    public CustomProcess() { }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Objects.requireNonNull(CustomService.class.getName());
        return Stream.of(CustomService.class.getName()).collect(Collectors.toSet());
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Set<? extends Element> elementsAnnotatedWith = roundEnv.getElementsAnnotatedWith(CustomService.class);
        for(Element e : elementsAnnotatedWith){
            System.out.println(e.getSimpleName());
        }
        return false;
    }
}
