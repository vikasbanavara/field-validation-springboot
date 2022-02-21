package com.ty.fieldvalidationspringboot.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.fieldvalidationspringboot.dto.Person;

@RestController
public class PersonController {

	@PostMapping("person")
	public Person savePerson(@RequestBody @Valid Person person) {
		return person;
	}
	
	@GetMapping("person")
	public Person getPerson() {
		return new Person();
	}
}
