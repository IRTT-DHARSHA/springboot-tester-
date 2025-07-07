package com.example.demo.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Pathmodel;

@RestController
@RequestMapping("/students")

public class PathController {
	private List<Pathmodel> std = new ArrayList<>();
	@PostMapping
	public String addStudent(@RequestBody Pathmodel student ) {
		
		std.add(student);
		return " Student added successfully";
	}
	@GetMapping
	public List<Pathmodel> getAllStudents(){
		return std;
	}
	
	
	

}