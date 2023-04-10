package com.demotest.demotest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemotestController {
    @RequestMapping("/training")
    public String training(){
        return "final spring boot application test";
    }

}
