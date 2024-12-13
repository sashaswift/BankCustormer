package com.example.banksystem.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

public class AccountVo {
    public String cardid;
    public String personid;
    public String cardpasswd;
    public BigDecimal balance;
    public Timestamp opendate;
    public String accountstate;

    public String getCardid() {
        return cardid;
    }

    public String getPersonid() {
        return personid;
    }

    public String getCardpasswd() {
        return cardpasswd;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Timestamp getOpendate() {
        return opendate;
    }

    public String getAccountstate() {
        return accountstate;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public void setCardpasswd(String cardpasswd) {
        this.cardpasswd = cardpasswd;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setOpendate(Timestamp opendate) {
        this.opendate = opendate;
    }

    public void setAccountstate(String accountstate) {
        this.accountstate = accountstate;
    }
}
