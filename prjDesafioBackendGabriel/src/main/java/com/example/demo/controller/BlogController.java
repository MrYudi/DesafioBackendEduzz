package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Blog;
import com.example.demo.repository.BlogRepository;

@RestController
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogRepository blogRepository;
	
	@GetMapping("/getAll")
	public List<Blog> getAll(){		
		//blogRepository.save(new Blog("Ti","Ca","Tex")); Somente para teste
		return blogRepository.findAll();
	}
	
	@GetMapping("/getOne/{id}")
	public Optional<Blog> getOne(@PathVariable("id") int id){
		return blogRepository.findById(id);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Object> save(@RequestBody Blog Blog){
		return new ResponseEntity<>(blogRepository.save(Blog), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public HttpStatus delete(@PathVariable("id") int id){
		blogRepository.deleteById(id);
		Optional<Blog> Blog = blogRepository.findById(id);
		if(Blog==null) {
			return HttpStatus.OK;
		}else {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
}
