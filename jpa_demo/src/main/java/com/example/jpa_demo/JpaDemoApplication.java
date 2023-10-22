package com.example.jpa_demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.jpa_demo.entities.User;
import com.example.jpa_demo.repository.UserRepository;

@SpringBootApplication
public class JpaDemoApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);
		
		UserRepository repo = context.getBean(UserRepository.class);
		
		//to add single user
//		User user= new User("akash","pune");
//		User user1=repo.save(user);
//		
		//to add multiple user
		
//		User user1=new User("seema","nagar");
//		User user2=new User("sayli","pune");
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result=repo.saveAll(users);
//		result.forEach(user ->{
//			System.out.println(user);
//		});
		
		// to update the information
		
//		Optional<User> optional = repo.findById(2);
//		User user = optional.get();
//		user.setName("this is boss");
//		User result = repo.save(user);
//		System.out.println("updated "+result);
		
		
		//to get the data
		
//		List<User> getAll= repo.findAll();
//		getAll.forEach(user->{
//			System.out.println(user.getName());
//		});
		
		
		// to delete the single user
//		repo.deleteById(1);
//		System.out.println("deleted user");
		
		
		// to delete multiple user
//		repo.deleteAll();
//		System.out.println("deleted all");
//		
		
	}

}
