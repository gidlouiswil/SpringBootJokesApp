/*
=====================================================================================================
*	FileName	:	JokeController.
*	FileType	:	Java.
*	Author		:	Gid Lou Iswil.
*	Made with	:	IntelliJ IDEA 2017.
*	BirthDate	:	Sunday, 20 May 2018.
*	Copy rights	:	Copyright (C) 2018  Gid Lou Iswil.
=====================================================================================================
*/
package com.gidlouiswil.springbootjokesapp.controllers;

import com.gidlouiswil.springbootjokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  A class that handles requests related to the Chuck Norris's quotes.
 */
@Controller
public class JokeController
{
    /**
     *  A variable that is used to get the Chuck Norris's quotes.It is used to obtain a randomly chosen quote.
     */
    private JokeService joke_service;

    /**
     *  Create a JokeController with the specified joke service.
     *  @param joke_service the specified joke service.
     */
    @Autowired
    public JokeController(JokeService joke_service)
    {
        this.joke_service = joke_service;
    }

    /**
     *  Adds to the model an attribute that has as value the randomly chosen joke
     *  and returns the name of the view associated to the « / » url .
     *	@return the name of the view template associated to the « / » url.
     */
    @RequestMapping({"/", ""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", joke_service.getJoke());

        return "chucknorris";
    }
}
