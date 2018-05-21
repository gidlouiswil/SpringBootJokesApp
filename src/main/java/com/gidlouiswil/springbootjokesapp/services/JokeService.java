/*
=====================================================================================================
*	FileName	:	JokeService.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 19 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.springbootjokesapp.services;

/**
 *  Defines common behaviors for the joke service .
 */
public interface JokeService
{
    /**
     *  Returns a randomly chosen joke.
     *	@return a randomly chosen joke.
     */
    public String getJoke();
}
