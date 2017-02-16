package org.meruvian.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.meruvian.workshop.jaxrs.Main;

/**
 * @author Meruvian
 */
@SpringBootApplication
@RestController
public class Application  extends SpringBootServletInitializer  implements WebApplicationInitializer {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Application.class);
	}

	public static void main(String[] args) throws Exception {
	        SpringApplication.run(Application.class, args);
	}

}
