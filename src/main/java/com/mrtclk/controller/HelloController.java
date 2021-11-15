package com.mrtclk.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Murat Çelik on Kas, 2021
 */
@RestController
@CrossOrigin //Servislerin diğer uygulamalar ile haberleşmesi için CORS desteğini açmamızı sağlar.
public class HelloController {


    @GetMapping("/")
    public String message(){
        return "Hello Cross Origin";
    }
}
