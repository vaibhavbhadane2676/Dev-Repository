package com.Test.TestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testAPI")
    public String testAPI(){
        return "Test api call successfully";
    }
}
