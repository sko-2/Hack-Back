package unk.HackBack.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unk.HackBack.Models.TestObject;

@RestController
public class Hello {

    @GetMapping("api/hello")
    public TestObject helloWorld() {
        return new TestObject("wazzup", "bitches");
    }
}
