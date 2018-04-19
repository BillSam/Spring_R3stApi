package com.classspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ammy on 4/19/18.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHellow(){
        return "Hi";
    }
}
