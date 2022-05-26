package com.example._23maysubscription.controller;

import com.example._23maysubscription.entiity.Response;
import com.example._23maysubscription.entiity.Subscribtion;
import com.example._23maysubscription.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    Service subService;

    @ResponseBody
    @PostMapping("/api/add")
    public Response add(@RequestBody  Subscribtion subscription) {
        subService.save(subscription);


        return new Response();




    }
}
