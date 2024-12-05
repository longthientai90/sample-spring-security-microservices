package dangtit90.top.services.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SecureCallerController {

    RestTemplate restTemplate;

    @Value("${client.url}")
    String clientUrl;

    public SecureCallerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/caller")
    public String call() {
        return "I'm `secure-caller`! calling... " +
                restTemplate.getForObject(clientUrl, String.class);
    }
}
