package br.com.vepilef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableSwagger2
@EnableCaching
public class PlatformBuildersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformBuildersApplication.class, args);
	}

}
