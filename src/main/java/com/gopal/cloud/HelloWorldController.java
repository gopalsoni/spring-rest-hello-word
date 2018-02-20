package com.gopal.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloWorld()
    {
        return "Hello World !!!!";
    }
    @GetMapping("/namaste")
    public String getNamasteWorld()
    {
        return "Namaste World !!!!";
    }



}
