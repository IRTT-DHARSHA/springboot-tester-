package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class PathService {
	public int add(int a,int b) {
		return a+b;
	}
	public boolean isEven(int n) {
		return n%2==0;
	}

}
