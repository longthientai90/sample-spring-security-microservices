package dangtit90.top.services.callme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureCallmeBundleController {

    @GetMapping("/callme")
    public String call() {
        return "I'm secure-callme-bundle!";
    }

}
