package com.test.service;

import com.test.model.RestResponse;
import org.springframework.stereotype.Service;

@Service
public class RestResponseService {
    public RestResponse getResponse(String name){
        RestResponse result = new RestResponse();
        result.setParam1("Misha");
        result.setParam2(name);

        return result;
    }
}
