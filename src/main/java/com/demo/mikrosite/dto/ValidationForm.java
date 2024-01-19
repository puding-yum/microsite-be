package com.demo.mikrosite.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidationForm {
    @JsonProperty(value = "debit_card")
    private String debitCard;
    
    private String phone;
    
    private String check1;
    
    private String check2;

    public String getDebitCard() {
        return debitCard;
    }
    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCheck1() {
        return check1;
    }
    public void setCheck1(String check1) {
        this.check1 = check1;
    }
    public String getCheck2() {
        return check2;
    }
    public void setCheck2(String check2) {
        this.check2 = check2;
    }
    
}
