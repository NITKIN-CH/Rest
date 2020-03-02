package com.test.controller;

import com.test.model.RestResponse;
import com.test.service.RestResponseService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {

    private RestResponseService response;

    @RequestMapping(value = "/misha", method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse restMethod(String name) {
        return response.getResponse(name);
    }

}

