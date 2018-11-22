package com.micro.system.controller;

import com.micro.system.bean.Element;
import com.micro.system.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "element")
public class ElementController {

    @Autowired
    private ElementService elementService;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Element element){
        return elementService.insert(element);
    }
}
