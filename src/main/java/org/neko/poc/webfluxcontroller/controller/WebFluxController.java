package org.neko.poc.webfluxcontroller.controller;

import org.neko.poc.webfluxcontroller.service.WebFluxControllerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/neko")
public class WebFluxController {
    private WebFluxControllerService webFluxControllerService;

    @PostMapping("/data-fetch")
    public void getData() {

    }
}
