package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Cs5200Spring2020LiHaolinA4Application.class);
	}

}
