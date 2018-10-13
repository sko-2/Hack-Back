package unk.HackBack.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unk.HackBack.Models.TestObject;

@CrossOrigin
@RestController
public class SuhDude {

    @GetMapping("api/SuhDude")
    public TestObject helloWorld() { return new TestObject("Suh", "Dude");}
}