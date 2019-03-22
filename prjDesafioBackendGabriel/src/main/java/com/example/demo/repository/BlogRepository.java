package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.Blog;

public interface BlogRepository extends CrudRepository<Blog, Integer>{

}
