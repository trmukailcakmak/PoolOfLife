package tr.com.cakmak.pool.service;

import org.springframework.stereotype.Service;
import tr.com.cakmak.pool.model.dto.UserRequestDto;
import tr.com.cakmak.pool.model.entity.Users;
import tr.com.cakmak.pool.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean saveUser(UserRequestDto userRequestDto){
        Users users=new Users();
        users.setName(userRequestDto.getName());
        users.setEmail(userRequestDto.getEmail());
        users.setPhone(userRequestDto.getPhone());
        users.setUserName(userRequestDto.getUserName());
        users.setPassword(userRequestDto.getPassword());
        userRepository.save(users);
        return true;
    }
}
