package com.example.springmultipledatasource.repository.user;

import com.example.springmultipledatasource.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
