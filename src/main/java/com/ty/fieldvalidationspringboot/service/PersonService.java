package com.ty.fieldvalidationspringboot.service;

import com.ty.fieldvalidationspringboot.dto.Person;

public class PersonService {
	public Person savePerson(Person person) {
		
		System.out.println("ID is "+person.getId());
		System.out.println("Name is "+person.getName());
		return person;
	}
	
	public Person getPerson() {
		Person person = new Person();
		person.setId(1);
		person.setName("Dimple");
		return person;
	}
}
