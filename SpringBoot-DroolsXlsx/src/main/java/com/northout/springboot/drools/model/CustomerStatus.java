package com.northout.springboot.drools.model;

public class CustomerStatus {

    private String name;
	private boolean newAccount = false;
    private int discount;


	public CustomerStatus(){
	}

    
	public CustomerStatus(String name, boolean newAccount, int discount ){
        this.name =name;
        this.newAccount = newAccount;
        this.discount = discount;
	}

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNewAccount(boolean newAccount) {
        this.newAccount = newAccount;
    }

    public boolean isNewAccount(){
        return newAccount;
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public int getDiscount(){
        return discount;
    }

    
}
