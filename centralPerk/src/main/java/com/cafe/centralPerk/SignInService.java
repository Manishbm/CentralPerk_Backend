//package com.cafe.centralPerk;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Service;
//
//import com.centralperk.userservice.MyUserRepository;
//import com.centralperk.userservice.SignUpEntity;
//
//@Service
//@ComponentScan (basePackages = "com.centralperk.userservice")
//public class SignInService {
//	private MyUserRepository myUserRepository;
//	//private SignUpEntity signUpEntity;
//	@Autowired
//	public SignInService(MyUserRepository myUserRepository ) {
//		this.myUserRepository=myUserRepository;
//		//this.signUpEntity=signUpEntity;
//	}
//	public String signIn(SignUpEntity signUpEntity) {
//		List<SignUpEntity> list = new ArrayList<SignUpEntity>();
//		list.addAll(myUserRepository.findAll());
//		for(int i =0 ; i<list.size();i++) {
//			if(list.get(i).getUserName().equals(signUpEntity.getUserName()) && list.get(i).getPassword().equals(signUpEntity.getPassword())) {
//				return "user signed in successfully";
//			}
//		}
//		return "credential given is incorrect";
//	}
//}
