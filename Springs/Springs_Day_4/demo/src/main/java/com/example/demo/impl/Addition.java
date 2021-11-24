package com.example.demo.impl;

import org.springframework.stereotype.Component;

import com.example.demo.AdditionInterface;

@Component 
public class Addition implements AdditionInterface {

	public int add(int x, int y) {
		
		return x+y;
	}

}
