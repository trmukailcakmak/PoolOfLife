package tr.com.cakmak.pool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.cakmak.pool.model.dto.FriendsRequestDto;
import tr.com.cakmak.pool.service.FriendsService;

@RestController
@RequestMapping("/friends")
public class FriendsController {
    private FriendsService friendsService;

    public FriendsController(FriendsService friendsService) {
        this.friendsService = friendsService;
    }
    @PostMapping("/save-friends")
    public Boolean saveUser(@RequestBody FriendsRequestDto friendsRequestDto){
        friendsService.saveFriends(friendsRequestDto);
        return false;
    }
}
