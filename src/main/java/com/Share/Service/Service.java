package com.Share.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfer")
public class Service {
    @PostMapping()
    public void  data(String text)
    {
        logic.push(text);
    }
    @GetMapping()
    public String recieve()
    {
        return reciever();
    }
}
