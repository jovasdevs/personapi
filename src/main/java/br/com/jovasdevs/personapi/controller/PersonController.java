package br.com.jovasdevs.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/vi/people")
public class PersonController {

    @GetMapping
    public String getBool(){
        return "API TESTE!";
    }
}
