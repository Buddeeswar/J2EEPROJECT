package com.pack;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyFirstListener
 *
 */
@WebListener
public class MyFirstListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MyFirstListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
          HttpSession hs=se.getSession();
          hs.setAttribute("dog", "labrado");
          hs.setAttribute("name", "diana");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
        
    }
	
}
