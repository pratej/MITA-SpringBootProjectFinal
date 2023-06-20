package com.mita.user.model.userprofile;

import java.math.BigDecimal;

public class Wallet {
    // Define the fields specific to the Wallet class
    // For example:
    private String currency;
    private BigDecimal balance;

    public Wallet(String currency, BigDecimal balance) {
        this.currency = currency;
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
// Constructors, getters, and setters
}
