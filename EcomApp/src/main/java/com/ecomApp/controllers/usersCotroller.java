package com.ecomApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomApp.models.Users;
import com.ecomApp.repositories.usersRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("users")
public class usersCotroller {

	@Autowired
	usersRepo userrepo;
	
	@PostMapping("addUser")
	public Users addUser(@RequestBody Users user) {
		return userrepo.save(user);
	}
	
	@GetMapping("allUsers")
	public List<Users> getAll()
	{
		List<Users> users= (List<Users>) userrepo.findAll();
		return users;
	}

			// get particular user by its ID
			@GetMapping("user/{id}")
			public Optional<Users> getCardById(@PathVariable int id)
			{
				return userrepo.findById(id);
			}
			
			// update existing user 
			@PutMapping("update/{id}")
			public Users updateCard(@RequestBody Users user)
			{
				return userrepo.save(user);
			}
			
			// delete particular user from database
			@DeleteMapping("delete/{id}")
			public void deleteCard(@PathVariable int id)
			{
				userrepo.deleteById(id);
			}

	
}
