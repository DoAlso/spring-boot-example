package org.spring.boot.example.servlet.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName MyFilter
 * @Author huyaxi
 * @DATE 2020/3/9 14:59
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    /**
     * Http请求时会触发过滤器，
     * 当存在多个过滤器时需要通过Ordered接口设置过滤顺序
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(">>> "+servletRequest.getContentType() + " >>>");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
