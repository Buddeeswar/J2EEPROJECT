package com.pack;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ExampleFilter
 */
//@WebFilter("/ExampleFilter")
public class ExampleFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ExampleFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//preprocessing
		System.out.println("Entering Filter");
		request.setAttribute("favmovie", "LordofRings");
		chain.doFilter(request, response);
		request.removeAttribute("favmovie");
		System.out.println(request.getAttribute("favmovie"));
		System.out.println("exiting filter");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
