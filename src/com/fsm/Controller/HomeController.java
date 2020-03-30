package com.fsm.Controller;

import com.fsm.Annotation.Controller;
import com.fsm.Annotation.Mapping;
import com.fsm.Enums.TYPE;

@Controller
public class HomeController {

    @Mapping(path = "/hello", type = TYPE.GET)
    public String hello() {
        return "Hello";
    }

}
