package com.springrest.springrest.controller;
import com.springrest.springrest.entity.user;
import com.springrest.springrest.services.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class mycontroller {
    @Autowired
    public userservice userservice;

    @GetMapping("/users")
    public List<user> getusers(){

        return this.userservice.getusers();
    }

    @GetMapping("/users/{userId}")
    public user getuser(@PathVariable String userId){
        return this.userservice.getuser(Long.parseLong(userId));
    }

    @PostMapping("/users")
    public user adduser(@RequestBody user user){

        return this.userservice.adduser(user);
    }

    @PutMapping("/users")
    public user updateuser(@RequestBody user user){

        return this.userservice.updateuser(user);
    }

    @DeleteMapping("/users")
    public ResponseEntity<HttpStatus> deleteuser(@PathVariable String userId){
        try{
            this.userservice.deleteuser(Long.parseLong(userId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
