package com.northout.springboot.drools.model;

public class Customer {

    private String name;
    private int yearsWithUs;
    private String state;
    private int discount;


    public Customer(){

    }

    public Customer(String name, int yearsWithUS, String state) {
        this.name = name;
        this.yearsWithUs = yearsWithUS;
        this.state = state;   
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYearsWithUs(){
        return this.yearsWithUs;
    }

    public void setYearsWithUs(int yearsWithUS){
        this.yearsWithUs = yearsWithUS;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
    
    
    
    
}
