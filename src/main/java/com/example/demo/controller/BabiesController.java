package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class BabiesController {

    @GetMapping("v1/babies/{id}/sum")
    public int sum(@PathVariable int id){
        return 0;
    }

}
