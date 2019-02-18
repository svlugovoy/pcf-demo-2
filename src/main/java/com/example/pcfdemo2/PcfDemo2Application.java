package com.example.pcfdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PcfDemo2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PcfDemo2Application.class, args);
    }

    @Autowired
    private PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("John", 25);
        Person p2 = new Person("Ivan", 35);
        Person p3 = new Person("Adam", 30);
        personRepository.save(p1);
        personRepository.save(p2);
        personRepository.save(p3);
    }
}
