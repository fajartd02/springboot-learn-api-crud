package com.example.demo.bird;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1/bird")
public class Bird {

    @GetMapping // GET
    public Map<String, Object> getBirds() {
        HashMap<String, Object> bird = new HashMap<>();
        bird.put("Elang", "800km");
        bird.put("Alvian", "7cm");
        return bird;
    }

//    @GetMapping
//    public List<String> getBirds() {
//        return List.of("Hello", "World!");
//    }

}
