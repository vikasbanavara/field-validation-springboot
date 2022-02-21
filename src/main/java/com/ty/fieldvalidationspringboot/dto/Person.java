package com.ty.fieldvalidationspringboot.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.ty.fieldvalidationspringboot.validation.PhoneNumber;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
	private int id;
	@NotNull(message = "name should not be null")
	private String name;
	@Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",message = "Enter proper email id")
	private String email;
	@PhoneNumber(message = "sorry invalid phone number")
	private long phone;
	@Min(value = 10,message = "Age should be more then 10")
	private int age;
	
	
}
