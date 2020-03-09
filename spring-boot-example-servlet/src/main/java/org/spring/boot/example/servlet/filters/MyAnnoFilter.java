package org.spring.boot.example.servlet.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ClassName MyAnnoListener
 * @Author huyaxi
 * @DATE 2020/3/9 15:12
 */
@WebFilter
public class MyAnnoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(">>> MyAnnoFilter: doFilter"+servletRequest.getContentType() + " >>>");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
