package bett.hello_world;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {
    @GetMapping(path = "/hello")
    public String helloworld(){
        return "Hello World";
    }
}
