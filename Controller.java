package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Product;
import com.dto.Student;
import com.dto.User;
import com.example.reposetery.StudentRepository;

@RestController
public class Controller1 
{
	@Autowired
StudentRepository sp ;
	
	
	@PostMapping("/savedata")
	public String saveStudent(@RequestBody Student s)
	{
		sp.save(s);
		return "saved" ;
	}
	@PostMapping("/savedata1")
	public String saveStudent1(@RequestBody Student s1)
	{
		sp.save(s1);
		return"saved" ;
	}
	@PostMapping("/savedata2")
	public String saveStudent2(@RequestBody Student s2)
	{
		sp.save(s2);
		return"saved" ;
	}
	@PostMapping("/savedata3")
    public String saveStudent3(@RequestBody Student s3)
    {
    	sp.save(s3);
    	return "saved";
    }
	 @GetMapping("/fetchStudentdata")
	    public Student getStudentbyId(@RequestParam int id)
	    {
	    	Optional<Student> s =sp.findById(id);
	    	Student student =s.get();
	    	return student ;
	    }
	 @DeleteMapping("/deleteStudentdata")
	    public String delete(@RequestParam int id)
	    {
	    	sp.deleteById(id);
	    	return "data deleted" ;
	    }
	 @PutMapping("/updateStudentdata")
	    public String updateuser(@RequestBody Student s)
	    {
	    	sp.save(s);
	    	return "data updated" ;
	    }
	
}
