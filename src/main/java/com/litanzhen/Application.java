package com.litanzhen;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!s热部署真好用啊 ";
    }

    //VM Options: -javaagent:C:\Users\Li\Desktop\API\springloaded-1.2.8.RELEASE.jar -noverify
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}