package Ooredoo.First.Training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("greeting")
    public String greeting ( Map<String,Object> model) {
        model.put("message","hello Amal");
        return  "greeting";
    }

    @GetMapping("thyme")
    public String thyme ( Map<String,Object> model) {
        model.put("message","hello ThymeLeaf");
        return  "thyme";
    }
}
