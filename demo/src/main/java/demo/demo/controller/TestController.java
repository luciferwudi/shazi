package demo.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class TestController {

    @GetMapping("/test")
    public Object test(){
        return "hello word";
    }

    @GetMapping("hello")
    public Object hello(){

        return "sS".toLowerCase();
    }



}
