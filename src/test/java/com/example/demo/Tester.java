package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.Service.PathService;

public class Tester {
 PathService cal =new PathService();
 @Test
 public void testAdd() {
	 assertEquals(30,cal.add(10,20));
 }
 @Test
 public void testisEven() {
	 assertTrue(cal.isEven(8));
	 
 }
 @Test
 public void testisEv() {
	 assertFalse(cal.isEven(10));
}
}