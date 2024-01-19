package com.demo.mikrosite.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mikrosite.dto.ValidationForm;
import com.demo.mikrosite.util.Util;

@RestController
@RequestMapping(value = "/home")
public class MainController {    
    @PostMapping(
        // consumes = MediaType.APPLICATION_JSON_VALUE
        // produces = MediaType.APPLICATION_JSON_VALUE
    )
    // @PostMapping
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ResponseEntity<Object> postSomething(@RequestBody ValidationForm request){
        System.out.println(Util.toJson(request).toString());
        System.out.println(request.getDebitCard());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(request, HttpStatusCode.valueOf(200));
    }
}
