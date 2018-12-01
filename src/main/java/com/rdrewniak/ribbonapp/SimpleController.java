package com.rdrewniak.ribbonapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SimpleController {

    @Autowired
    private RestTemplate restTemplate;


    /**
     * Note that instead of passing real URL to the service, we are using the logical identifier
     * 'service' and this is the same name under which service is registered in service discovery server.
     * At runtime RestTemplate will function as a client side load balancer and it will use service discovery
     * to resolve the real locations of the 'service' instances and then use the configured load balancing
     * algorithm to distribute the load between them (by default round robin).
     *
     */
    @GetMapping("/")
    public String callServiceApp() {
        return restTemplate.getForEntity("http://service", String.class).getBody();
    }
}
