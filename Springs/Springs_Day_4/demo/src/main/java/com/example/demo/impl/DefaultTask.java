package com.example.demo.impl;

import org.springframework.stereotype.Component;

import com.example.demo.Task;
import com.example.demo.TaskInterface;

@Component
public class DefaultTask implements TaskInterface {

	@Override
	public Task getTask(int id) {
		Task t  = new Task();
		//conntec the db, get the task with id 
		t.setTaskid(100);
		t.setTaskname("REST Controller");
		t.setDesc("Write a rest contrller for getting tasks");
		return t;
	}

}
