package fr.allianz.t2.paas.poc.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloWorldResource {

    @RequestMapping(value="/helloworld", method = RequestMethod.GET, produces = "application/json")
    public String helloWorld(@RequestParam String nom){
        log.info("Appel du service hello");
        return "Hello "+nom;
    }
}
