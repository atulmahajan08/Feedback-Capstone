package io.swagger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
@ComponentScan(basePackages = { "swagger", "com.cts.feedback.apiconfiguration" ,"com.cts.feedback.service","com.cts.feedback.entity","io.swagger.configuration","com.cts.feedback.security"})
@EnableR2dbcRepositories(basePackages = ("com.cts.feedback.repository"))
public class Swagger2SpringBoot implements CommandLineRunner {

	public static final Logger LOGGER = LoggerFactory.getLogger(Swagger2SpringBoot.class);
	
    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) throws Exception {
        LOGGER.info("User Service has been Started....");
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
}
