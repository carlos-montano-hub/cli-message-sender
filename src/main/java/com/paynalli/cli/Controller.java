package com.paynalli.cli;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {



    @GetMapping("/")
    public Message getMessage(@RequestParam(defaultValue = "defMessage") Message message) {

    return message;
}







}
