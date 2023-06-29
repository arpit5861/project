package com.demo.multidb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    // validated via token only
    @GetMapping("/api/validated")
    public String validation() {
        return "Token validated successfully";
    }
}
