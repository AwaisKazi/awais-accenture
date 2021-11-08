package com.northout.springboot.drools.model;

public class CreditCustomer {

    private String name;
    private int age;
    private int creditScore;
    private int loanAmount = 0;

    public CreditCustomer()
    {

    }

    public CreditCustomer(String name, int age, int creditScore, int loanAmount)
    {
        this.name = name;
        this.age = age;
        this.creditScore = creditScore; 
        this.loanAmount = loanAmount; 

    }

    public void hightenScore(int addToScore) 
    {
        this.creditScore = creditScore + addToScore; 
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    





}
