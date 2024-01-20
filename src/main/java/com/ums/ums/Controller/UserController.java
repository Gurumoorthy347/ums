package com.ums.ums.Controller;

import com.ums.ums.Entity.User;
import com.ums.ums.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable("id") Long userId) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(userId));
    }
}
