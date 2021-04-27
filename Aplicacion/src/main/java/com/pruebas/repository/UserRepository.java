package com.pruebas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebas.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
