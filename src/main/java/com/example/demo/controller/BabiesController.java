package com.example.demo.controller;

import com.example.demo.dto.Sleep;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/")
public class BabiesController {

    private static List<Sleep> sleepList = new ArrayList<>();

    @GetMapping("v1/babies/{id}/sum")
    public int sum(@PathVariable int id){
        if(sleepList.size() == 0){
            return 0;
        }
        return sleepList.get(0).getDuration();
    }

    @PostMapping("v1/babies")
    public ResponseEntity add(@RequestBody Sleep sleep){
        sleepList.add(sleep);
        return ResponseEntity.status(201).body(null);
    }
}
