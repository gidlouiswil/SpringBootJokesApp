/*
=====================================================================================================
*	FileName	:	SpringbootjokesApplication.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 19 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.springbootjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *  A class that launches the application.
 */
@SpringBootApplication
@ImportResource("classpath:chuck_norris_quotes-configuration.xml")
public class SpringbootjokesApplication
{

    /**
     *  Launches the application.
     *	@param args The list of arguments with which the application is launched.
     */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootjokesApplication.class, args);
	}
}
