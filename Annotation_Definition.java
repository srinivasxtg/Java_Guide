package com.etcc.sampleMaven;
import java.lang.annotation.*;  
import java.lang.reflect.*;
import java.text.SimpleDateFormat;


  

  
//Applying annotation  
class Annotation_Definition{ 
	
	
	@Retention(RetentionPolicy.RUNTIME)  
	@Target(ElementType.METHOD)  
	@interface yourAnnotation{ 
		static final int hours=new SimpleDateFormat().getCalendar().getTime().getHours();
	int value();
	
	}  	
	
	
	
@yourAnnotation(value= 2)  
public void sayHello(){System.out.println("hello annotation");}  
}  
  
//Accessing annotation  
