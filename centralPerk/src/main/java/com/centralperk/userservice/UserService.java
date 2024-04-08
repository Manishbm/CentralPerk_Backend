package com.centralperk.userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	private MyUserRepository myUserRepository;
	@Autowired
	public UserService(MyUserRepository myUserRepository) {
		this.myUserRepository=myUserRepository;
	}
	public SignUpEntity addUser(SignUpEntity userEntity) {
		return myUserRepository.save(userEntity);
	}
	public List<SignUpEntity> findAllUsers(){
		return myUserRepository.findAll();
		}
	public SignUpEntity findById(String id) {
		return myUserRepository.findById(id).orElseThrow();
		}
	public boolean login(String userName ,String password) {
		SignUpEntity userId1 = myUserRepository.findByUserName(userName);
		System.out.println(userId1.getPassword());
		SignUpEntity userId2 = myUserRepository.findByPassword(password);
		System.out.println(userId2.getUserName());
		if(userId1.getPassword().equals(password) && userId2.getUserName().equals(userName) && userId1.getId().equals(userId2.getId()) ) 
			return true;
		else
			return false;
	}
	public SignUpEntity modifyById(String id , SignUpEntity userEntity) {
		SignUpEntity existingUser = myUserRepository.findById(id).orElse(null);
		existingUser.setEmailId(userEntity.getEmailId());
		existingUser.setPhoneNo(userEntity.getPhoneNo());

		return myUserRepository.save(existingUser);
	}

}
