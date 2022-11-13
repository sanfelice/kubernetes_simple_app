package com.sanfelice.techtalk.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController("/")
public class HelloWorld {

    @GetMapping
    public String index() throws UnknownHostException {
        return "Response from pod %s".formatted(System.getenv("MY_POD_ID"));
    }
}
