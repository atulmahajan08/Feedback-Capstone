package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "com.io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-T15:35:34.885+05:30[Asia/Calcutta]")
@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("authentication")
            .description("USER DETAILS")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.cts.feedback.apiconfiguration"))
               .build()
               .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
               .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class)
               .apiInfo(apiInfo());
    }

}
