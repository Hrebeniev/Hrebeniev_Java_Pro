package com.hillel.hrebeniev.homeworks.homework_33;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PingController {
    @GetMapping("/ping")
    public String ping() {
        return "ping/ping";
    }
}