package com.ydm.api_autotest.controller;

import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {
    private static final Logger log= LoggerFactory.getLogger(indexController.class);
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        log.info("/index");
        return "index";
    }
}
