package com.moviereserve.park;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.FilterRegistration.Dynamic;

import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.moviereserve.park.config.security.SecurityConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	private final int MAX_UPLOAD_SIZE = 1024 * 1024; // 1MB 
	/*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		ServletRegistration.Dynamic appServlet = servletContext.addServlet("dispatcher", 
			new DispatcherServlet(new GenericWebApplicationContext()));
		
		appServlet.setLoadOnStartup(1);
		
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/upload",
				MAX_UPLOAD_SIZE, MAX_UPLOAD_SIZE * 5, MAX_UPLOAD_SIZE * 5 / 2);
		appServlet.setMultipartConfig(multipartConfigElement);
	}*/
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {RootConfig.class, SecurityConfig.class};
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AppConfig.class};
	}
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String [] {"/"};
	}
}
