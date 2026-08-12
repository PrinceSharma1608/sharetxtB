package com.Share.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfer")
@CrossOrigin(origins = "*")
public class API {

    @Autowired
    private logic logic;

    @PostMapping()
    public String data(@RequestParam String text) {
        String code = logic.push(text);
        return code;
    }

    @GetMapping()
    public String recieve(@RequestParam String i) {
        return logic.reciever(i);
    }
}
