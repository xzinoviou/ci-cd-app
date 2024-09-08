package com.xzinoviou.cicdapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author : Xenofon Zinoviou
 */
@RestController
@RequestMapping("/app")
public class MyController {

    @GetMapping("/{name}")
    public ResponseEntity<Map<String, String>> hello(@PathVariable String name) {
        return ResponseEntity.ok(Map.of("name", name));
    }
}
