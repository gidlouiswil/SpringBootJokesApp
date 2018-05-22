/*
=====================================================================================================
*	FileName	:	ChuckNorrisQuotesConfiguration.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Monday, 21 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.springbootjokesapp.configurations;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  The configuration related to the Chuck Norris's quotes.
 */
//@Configuration
public class ChuckNorrisQuotesConfiguration
{
    /**
     *  Returns an instance of the ChuckNorrisQuotes class.
     *	@return an instance of the ChuckNorrisQuotes class.
     */
    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes()
    {
        return new ChuckNorrisQuotes();
    }
}
