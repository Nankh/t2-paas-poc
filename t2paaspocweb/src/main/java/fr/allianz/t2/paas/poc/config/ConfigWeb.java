package fr.allianz.t2.paas.poc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {
        "fr.allianz.t2.paas.poc.api"
})
public class ConfigWeb {
}
