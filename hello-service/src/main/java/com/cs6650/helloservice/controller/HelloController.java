package com.cs6650.helloservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        log.info("Hello endpoint called");
        return ResponseEntity.ok("Hello, World!");
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> sayHelloToName(@PathVariable String name) {
        log.info("Personalized hello called for: {}", name);
        return ResponseEntity.ok(String.format("Hello, %s!", name));
    }
    @GetMapping("/echo/{text}")
    public ResponseEntity<String> echo(@PathVariable String text) {
        return ResponseEntity.ok(text);
    }

}
