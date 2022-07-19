package com.cawooka.beegeventsapi.controllers;

import com.cawooka.Beagle;
import dto.BeagleDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beagle")
public class BeagleController {

    @PostMapping("/add")
    public ResponseEntity<Beagle> add(@RequestBody BeagleDto beagleDto) {
        return null;
    }
}
