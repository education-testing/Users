package com.co.example.walter.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class User {

    @Autowired private DataBaseFake dataBaseFake;

    @PostMapping(value = "/create")
    public ResponseEntity createUser(@RequestBody Users user){
        dataBaseFake.addUser(user);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getUser(@PathVariable Integer id){
        Users userConsulted = dataBaseFake.getUser(id);
        return new ResponseEntity(userConsulted ,HttpStatus.OK);
    }

}
