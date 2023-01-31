package com.example.backend;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3952676930716558127L;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private String password;

}
