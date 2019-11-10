
package com.rakib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author aman
 */
@Controller
public class HomeController {
    
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
