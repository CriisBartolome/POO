package com.example.ServicioRESTSwaggerDocumentacion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class ConfiguracionSwagger {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo())
                                                      .select()
                                                      .paths(PathSelectors.regex("/"))
                                                      .build();
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Servicio REST Productos")
                .contact(new Contact("Cristina", "https://github.com/CriisBartolome",null))
                .license("Apache 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0").build();
    }
}
