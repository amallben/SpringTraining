package Ooredoo.First.Training.controller;

import Ooredoo.First.Training.model.Registration;
import Ooredoo.First.Training.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Amal") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Bensba") String lastName,
                        @RequestParam(value = "age", defaultValue = "24") int age) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("User firstName : " +user.getFirstName());
        return user;
    }
}
