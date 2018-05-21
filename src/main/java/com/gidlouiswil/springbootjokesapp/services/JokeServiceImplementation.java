/*
=====================================================================================================
*	FileName	:	JokeServiceImplementation.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Saturday, 19 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 *  An implementation of the joke service interface.
 */
@Service
public class JokeServiceImplementation implements JokeService
{
    /**
     *  A variable that contains the Chuck Norris's quotes.It is used to obtain a randomly chosen quote.
     */
    private final ChuckNorrisQuotes chuck_norris_quotes;

    /**
     *  Create a JokeServiceImplementation.
     */
    public JokeServiceImplementation()
    {
        this.chuck_norris_quotes = new ChuckNorrisQuotes();
    }

    /**
     *  Returns a randomly chosen joke.
     *	@return a randomly chosen joke.
     */
    @Override
    public String getJoke()
    {
        return chuck_norris_quotes.getRandomQuote();
    }
}
