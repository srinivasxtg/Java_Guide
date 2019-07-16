package com.etcc.sampleMaven;

import java.text.SimpleDateFormat;

public class blocks {

	
	{
		System.out.println("i am instance block");
	
	
	}
	blocks(){
		System.out.println("i am constructor");
	}
	
	
	public static void main(String[] args) {
		blocks block1 = new blocks();
		
		System.out.println(new SimpleDateFormat().getCalendar().getTime().getHours());
	}
}
