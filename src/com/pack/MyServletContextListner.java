package com.pack;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextListner
 *
 */
//@WebListener
public class MyServletContextListner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyServletContextListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
        ServletContext sc=sce.getServletContext();
        String mysub=sc.getInitParameter("subject");
        sc.getAttribute(mysub);
    }
	
}
