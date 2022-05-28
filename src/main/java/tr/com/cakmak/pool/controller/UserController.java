package tr.com.cakmak.pool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tr.com.cakmak.pool.model.dto.UserRequestDto;
import tr.com.cakmak.pool.service.UserService;

@RestController("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save-user")
    public Boolean saveUser(@RequestBody UserRequestDto userRequestDto){
        this.userService.saveUser(userRequestDto);
        return false;
    }

    @GetMapping("/save-user")
    public Boolean saveUser(){
        return false;
    }
}
