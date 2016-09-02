package test;


import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/aaa")
    String home() {
        return "Hello World1111!";
    }

//	public static void main(String[] args) throws Exception {
//        SpringApplication.run(Example.class, args);
//    }

}