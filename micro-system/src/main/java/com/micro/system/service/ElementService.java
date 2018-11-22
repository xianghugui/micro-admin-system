package com.micro.system.service;

import com.micro.system.bean.Element;
import com.micro.system.mapper.ElementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementService {
    @Autowired
    private ElementMapper elementMapper;

    public boolean insert(Element element) {
      boolean result =  elementMapper.insert(element);
        return result;
    }

}
