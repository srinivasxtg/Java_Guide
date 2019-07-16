package com.etcc.sampleMaven;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleDimensionArrayWithDataProvider {

    @Test(dataProvider = "dp")
    public void testMethod(Object object) {
        if (object instanceof String[]) {
            System.err.println("Incoming array was " + Arrays.toString((String[]) object));
        }
        if (object instanceof String) {
            System.err.println("Incoming string " + object);
        }

    }

    @DataProvider(name = "dp")
    public Object[][] getData() {
        return new Object[][]{
                {new String[]{"TestNG", "JUnit"}},
                {"Cedric Beust"}
        };
    }
}