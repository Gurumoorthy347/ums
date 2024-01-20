package com.ums.ums.Repository;

import com.ums.ums.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository< User, Long> {
}
