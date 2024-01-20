package com.ums.ums.ServiceImpl;

import com.ums.ums.Entity.User;
import com.ums.ums.Repository.UserRepository;
import com.ums.ums.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * @param user
     * @return user
     */
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public ResponseEntity<Object> getUserById(Long userId) {
        Optional<User> userDetails = userRepository.findById(userId);
        if(userDetails.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User is not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(userRepository.findById(userId).get());
    }
}
