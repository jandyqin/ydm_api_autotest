package com.ydm.api_autotest.controller;

import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {
    private static final Logger log= LoggerFactory.getLogger(indexController.class);
    @RequestMapping(value = "/ing/{id}", method = RequestMethod.GET)
    public Object index1() {
        log.info("/index");
        return "index";
    }





    public static void main(String[] args) {

//        for (int i=1;i<=9;i++){
//            for (int m=1;m<=i;m++){
//                System.out.print(i+"*"+m+"="+m*i+"	");
//            }
//            System.out.println();
//        }

    }
}
