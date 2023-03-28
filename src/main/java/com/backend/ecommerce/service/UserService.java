package com.backend.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.ecommerce.dao.UserDao;
import com.backend.ecommerce.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userdao;
	public List<User> getAllUsers(){
		return this.userdao.findAll();
	}
	public User getUser(String userEmail)
	{
		Optional<User> usr= userdao.findById(userEmail);
		if(usr.isPresent())
			return usr.get();
		return null;
	}
	public String addUser(User user)
	{
		User temp=getUser(user.getUserEmail());
		if(temp==null)
		{
		this.userdao.save(user);
		return "user added successfully";
		}
		return "useremail already exists";
	}
	public String UpdateUser(User user)
	{
		User temp= getUser(user.getUserEmail());
		if(temp!=null)
		{
			this.userdao.save(user);
			return "User update successfully";
		}
		return "user not found";
	}
	public String removeUser(String userEmail)
	{
		User user=getUser(userEmail);
		if(user!=null)
		{
		this.userdao.delete(user);
		return "user removed succesfully";
		}
		return "Invalid user email";
	}
}
