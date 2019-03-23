package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
