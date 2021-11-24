package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	@Autowired
	TaskInterface task;
	@GetMapping(value = "/task")

	//@RequestMapping(value = "/task", method = RequestMethod.GET,produces = {"application/json","application/xml"})
	public Task getTask() {
		return task.getTask(100);	
	}
	
}
