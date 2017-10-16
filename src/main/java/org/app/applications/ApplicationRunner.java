package org.app.applications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({ "org.app.controllers" })
/*@ComponentScan({ "org.app.controllers" })
@PropertySources(value = { @PropertySource("classpath:/application.properties") })*/
public class ApplicationRunner extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplicationRunner.class);
	}

	public static void main(String[] args) {
		 SpringApplication.run(ApplicationRunner.class, args);
	}
}