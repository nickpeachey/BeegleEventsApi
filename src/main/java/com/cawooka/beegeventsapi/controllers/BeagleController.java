package com.cawooka.beegeventsapi.controllers;

import com.cawooka.Beagle;
import com.cawooka.BeagleProducer;
import dto.BeagleDto;
import org.springframework.http.HttpStatus;
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
        BeagleProducer producer = new BeagleProducer();
        Beagle beagle = producer.submitBeagle(beagleDto);
        return new ResponseEntity<Beagle>(beagle, HttpStatus.OK);
    }
}
