package com.Fifthspring.Fifth.Service;

import org.springframework.stereotype.Service;

@Service
public class Task1 {

	int a;
	int b;
	public int add(int a,int b)
	{
		return a+b;
	}
	public int pro()
	{
		return a*b;
	}
	public int diff()
	{
		
		return a-b;
	}
	
}
