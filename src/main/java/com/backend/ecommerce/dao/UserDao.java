package com.backend.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.ecommerce.model.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{

}
