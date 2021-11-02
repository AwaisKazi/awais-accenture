package com.example.demo.model;

public class CreditScore {
    private Applicant applicant;
    private int creditScore;
    private int loanAmount;


    public CreditScore() {
    }

    public CreditScore(Applicant applicant, int creditScore) {
        this.applicant = applicant;
        this.creditScore = creditScore;
        this.loanAmount = 0;
    }

    public Applicant getApplicant() {
        return this.applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public int getCreditScore() {
        return this.creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

}
