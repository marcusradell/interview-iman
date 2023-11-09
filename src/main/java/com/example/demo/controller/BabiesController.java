package com.example.demo.controller;

import com.example.demo.dto.Sleep;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class BabiesController {

    @GetMapping("v1/babies/{id}/sum")
    public int sum(@PathVariable int id){
        return 0;
    }

    @PostMapping("v1/babies")
    public ResponseEntity add(@RequestBody Sleep sleep){
        return ResponseEntity.status(201).body(null);
    }
}
