package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Blog;
import com.example.demo.repository.BlogRepository;

@RestController
@RequestMapping("/blog")
public class BlogController 
{
	Blog blog;
	@Autowired
	private BlogRepository blogs;
	
	public BlogController ()
	{
		blog = new Blog("Sou um titulo","Sou uma Categoria","Sou um texto");
	}
	
	@PostMapping()
	public void save() 
	{
		blogs.save(blog);
	}
}
