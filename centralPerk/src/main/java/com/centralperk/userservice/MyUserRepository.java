package com.centralperk.userservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MyUserRepository extends MongoRepository<SignUpEntity, String>{
 SignUpEntity findByUserName(String userName);
 SignUpEntity findByPassword(String password);
 
}
