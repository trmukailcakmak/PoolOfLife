package tr.com.cakmak.pool.controller;

import org.springframework.web.bind.annotation.*;
import tr.com.cakmak.pool.model.dto.FriendsRequestDto;
import tr.com.cakmak.pool.model.dto.UserRequestDto;
import tr.com.cakmak.pool.service.FriendsService;
import tr.com.cakmak.pool.service.UserService;

//Dependency Injection
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save-user")
    public Boolean saveUser(@RequestBody UserRequestDto userRequestDto){
        userService.saveUser(userRequestDto);
        return false;
    }


    @GetMapping("/save-user")
    public Boolean saveUser(){
        return false;
    }
}
