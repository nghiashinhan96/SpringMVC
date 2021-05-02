package net.codejava.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("net.codejava")
public class MvcConfig {
@Bean(name="viewResolver")
public InternalResourceViewResolver getViewResolver() {
	InternalResourceViewResolver internalViewResolver = new InternalResourceViewResolver();
	internalViewResolver.setPrefix("/WEB-INF/views/");
	internalViewResolver.setSuffix(".jsp");
	return internalViewResolver;
}
	
}
;