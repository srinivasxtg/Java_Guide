package com.etcc.sampleMaven;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.etcc.sampleMaven.CustomAnnotation.JsonField;

	public class Car {
		
		
		@BeforeMethod
	       public  void  beforemethod(Method method, Object[] params){
	             String classname = getClass().getSimpleName();
	             String methodName = method.getName();
	             String paramsList = Arrays.asList(params).toString();   
	       }

	   @Test(dataProvider = "name")
	       public void exampleTest()
	   {}


	   @DataProvider(name = "name")
	   public static Object[][] name() {
	       return new Object[][]{
	               {"param1", "param2"},
	               {"param1", "param2"}
	       };

		    
		}
	}
		 
	   
	
	
	

