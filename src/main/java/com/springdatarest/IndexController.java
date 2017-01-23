package com.springdatarest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by rasaq on 22/01/2017.
 */

@Controller
public class IndexController {


    @RequestMapping(value="/")
    public String index(){
        return "index";
    }
}
