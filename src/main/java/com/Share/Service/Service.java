package com.Share.Service;

import org.springframework.web.bind.annotation.*;

private logic logic;
@RestController
@RequestMapping("/transfer")
public class Service {
    @PostMapping()
    public String data(String text)
    {
       String code= logic.push(text);
        return code;
    }
    @GetMapping()
    public String recieve(@RequestParam String i)
    {
        return logic.reciever(i);
    }
}
