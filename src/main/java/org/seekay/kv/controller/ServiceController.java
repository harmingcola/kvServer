package org.seekay.kv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ServiceController {

    @ResponseBody
    @RequestMapping(value = "/service/times", method = GET)
    public long timestamp() {
        return new Date().getTime();
    }
}
