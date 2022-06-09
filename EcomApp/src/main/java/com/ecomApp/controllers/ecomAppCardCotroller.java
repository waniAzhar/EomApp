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

import com.ecomApp.models.ecomAppCard;
import com.ecomApp.repositories.ecomAppCardRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("ecomAppCart")
public class ecomAppCardCotroller {

	@Autowired
	ecomAppCardRepo mcr;
	
	@PostMapping("addCard")
	public ecomAppCard addProduct(@RequestBody ecomAppCard ecomAppcard) {
		return mcr.save(ecomAppcard);
	}
	
	@GetMapping("allCards")
	public List<ecomAppCard> getAll()
	{
		List<ecomAppCard> cards= (List<ecomAppCard>) mcr.findAll();
		return cards;
	}

			// get particular Card by its ID
			@GetMapping("card/{id}")
			public Optional<ecomAppCard> getCardById(@PathVariable int id)
			{
				return mcr.findById(id);
			}
			
			// update existing Card 
			@PutMapping("update/{id}")
			public ecomAppCard updateCard(@RequestBody ecomAppCard ecomAppCard)
			{
				return mcr.save(ecomAppCard);
			}
			
			// delete particular Card from database
			@DeleteMapping("delete/{id}")
			public void deleteCard(@PathVariable int id)
			{
				mcr.deleteById(id);
			}

	
}
