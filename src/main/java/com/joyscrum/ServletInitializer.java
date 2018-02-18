package com.joyscrum;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Create a deployable war file.
 * The first step in producing a deployable war file is to provide a SpringBootServletInitializer subclass and override its configure method.
 * @author WellDev Java Team
 * 
 */

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JoyscrumApplication.class);
	}

}
