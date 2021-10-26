package com.northout.springboot.drools.model;

public class Customer {

    private String name;
    private int yearsCustomer;
    private int discount; 

    public Customer()
    {

    }

    public Customer(String name, int yearsCustomer, int discount)
    {
        this.name = name;
        this.yearsCustomer = yearsCustomer;
        this.discount = discount;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getYearsCustomer() {
        return yearsCustomer;
    }
    public void setYearsCustomer(int yearsCustomer) {
        this.yearsCustomer = yearsCustomer;
        
    }
    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    
}
