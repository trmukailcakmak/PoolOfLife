package tr.com.cakmak.pool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.cakmak.pool.model.dto.FriendsRequestDto;
import tr.com.cakmak.pool.model.dto.UserRequestDto;
import tr.com.cakmak.pool.model.entity.Friends;
import tr.com.cakmak.pool.model.entity.Users;
import tr.com.cakmak.pool.repository.FriendsRepository;
import tr.com.cakmak.pool.repository.UserRepository;

import java.util.Optional;

@Service
public class FriendsService {

    private FriendsRepository friendsRepository;

    @Autowired
    private UserRepository userRepository;

    public FriendsService(FriendsRepository friendsRepository) {
        this.friendsRepository = friendsRepository;
    }

    public Boolean saveFriends(FriendsRequestDto friendsRequestDto){
        Friends friends=new Friends();
        Optional<Users> users = userRepository.findById(Long.valueOf(friendsRequestDto.getUserId()));
        if (users.isPresent())
        {
            friends.setUsers(users.get());
        }

        friends.setName(friendsRequestDto.getName());
        friends.setSurname(friendsRequestDto.getSurname());
        friends.setEmail(friendsRequestDto.getEmail());
        friends.setPhone(friendsRequestDto.getPhone());
        friends.setDegreeOfProximity(friendsRequestDto.getDegreeOfProximity());
        friendsRepository.save(friends);
        return true;
    }
}
