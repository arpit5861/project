package com.demo.multidb.controller;

import com.demo.multidb.security.JwtTokenUtil;
import io.prometheus.client.Counter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicAccessController {
    private static final Counter requests = Counter.build().name("count_requests_total").help("Total count requests.").register();
    private static int num = 0;
    @Autowired
    JwtTokenUtil jwtTokenUtil;

    //public api. Can be access without token
    @GetMapping("/public/count")
    public int count() {
        requests.inc();
        return ++num;
    }

    //public api. Can be access without token
    @GetMapping("/getToken")
    public String getToken() {
        String token = jwtTokenUtil.generateToken("arpit");
        return token;
    }
}
