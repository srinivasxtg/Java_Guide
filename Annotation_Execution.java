package com.etcc.sampleMaven;
import java.lang.reflect.Method;


import com.etcc.sampleMaven.Annotation_Definition.yourAnnotation;

class Annotation_Execution{  
public static void main(String args[])throws Exception{  
  
Annotation_Definition h=new Annotation_Definition();  
//to GEt the method object
Method m=h.getClass().getMethod("sayHello");  

//to get assigned annotation object to the method if annotation present on method  
yourAnnotation annotation=m.getAnnotation(yourAnnotation.class);

// to print the value of assigned annotation attribute "value" 
System.out.println("value is: "+annotation.value());  
}}  
