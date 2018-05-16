package com.sergeome.springBootServerless;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}
