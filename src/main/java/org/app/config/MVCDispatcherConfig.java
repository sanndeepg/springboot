package org.app.config;

import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@Configuration
public class MVCDispatcherConfig /*extends WebMvcConfigurerAdapter*/ {
	@Bean
	public InternalResourceViewResolver viewResolver() {
	
	  InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	  resolver.setPrefix("/WEB-INF/view/");
	  resolver.setSuffix(".jsp");
	  
	  return resolver;
	}
    
	//@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("welcome");
        registry.addViewController("/").setViewName("welcome");
        registry.addViewController("/hello").setViewName("welcome");
        registry.addViewController("/login").setViewName("welcome");
    }
	 
	 
	@Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }
	
	@Bean
    public ServletRegistrationBean dispatcherServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(
                dispatcherServlet(), "/api/");
        registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
        return registration;
    }
	 
}
