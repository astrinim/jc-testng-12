package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmployeeTest {

    Employee employee;



    @BeforeMethod
    public void setUp(){ //membuat state
        employee = new Employee();

    }

    @Test
    public void testName(){
        //Employee employee = new Employee();
        employee.setName("Astrin");
        Assert.assertEquals(employee.getName(), "Astrin");
    }

    @Test
    public void testAddress(){
        //Employee employee = new Employee();
        employee.setAdress("Jakarta");
        Assert.assertEquals(employee.getAdress(), "Jakarta");
    }

    @Test
    public void testSalary(){
        //Employee employee = new Employee();
        employee.setSalary(2000000);
        Assert.assertEquals(employee.getSalary(), 2000000);
    }







}
