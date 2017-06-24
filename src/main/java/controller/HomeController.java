package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Mateusz on 2017-06-24.
 */

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @GetMapping
    @ResponseBody
    public String home(){
        return "Hello World";
    }
}
