package com.ums.ums.Service;

import com.ums.ums.Entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User saveUser(User user);

    ResponseEntity<Object> getUserById(Long userId);
}
