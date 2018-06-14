package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Users;

public interface UserRepository extends CrudRepository<Users, Long> {

	List<Users> findByName(String name);
}
