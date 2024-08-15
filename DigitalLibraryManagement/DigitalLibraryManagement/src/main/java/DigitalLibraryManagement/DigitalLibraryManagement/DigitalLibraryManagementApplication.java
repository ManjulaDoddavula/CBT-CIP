package DigitalLibraryManagement.DigitalLibraryManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
@ComponentScan(basePackages = {"com.DLM"})
@EntityScan("com.DLM.Entity")
@EnableJpaRepositories("com.DLM.Repo")
@Configuration
@EnableWebMvc
public class DigitalLibraryManagementApplication implements WebMvcConfigurer {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Digital Library Management System API").version("1.0")
			.description("Digital Library Management System API using Spring Boot")
			.termsOfService("http://swagger.io/terms/")
			.license(new License().name("Apache 2.0").url("http://springdoc.")
					));
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	      registry.addResourceHandler("swagger-ui.html")
	               .addResourceLocations("classpath:/META-INF/resources/");
	      registry.addResourceHandler("/webjars/**")
	               .addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DigitalLibraryManagementApplication.class, args);
	}
}