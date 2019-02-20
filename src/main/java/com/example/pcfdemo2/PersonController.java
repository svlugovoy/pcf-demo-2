package com.example.pcfdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> applicationData() {

        return ResponseEntity.ok().body(personRepository.findAll());
    }

    @GetMapping(value = "/persons/{name}")
    public ResponseEntity<Person> applicationData(@PathVariable String name) {

        return ResponseEntity.ok().body(personRepository.findByName(name).get(0));
    }

    @Value("${my.test:}")
    private String str;

    @GetMapping(value = "/test")
    public ResponseEntity<String> test() {

        return ResponseEntity.ok().body(str);
    }
}
