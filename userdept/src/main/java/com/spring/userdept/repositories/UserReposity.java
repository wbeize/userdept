package com.spring.userdept.repositories;

import com.spring.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<User, Long> {

}
