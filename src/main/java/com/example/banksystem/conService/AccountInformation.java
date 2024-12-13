package com.example.banksystem.conService;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

@TableName("Card")
public class AccountInformation {

    @TableId("cardid")
    public String cardid;
    public String personid;
    public String cardpasswd;
    public BigDecimal balance;
    public Timestamp opendate;
    public String accountstate;

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setAccountstate(String accountstate) {
        this.accountstate = accountstate;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public void setCardpasswd(String cardpasswd) {
        this.cardpasswd = cardpasswd;
    }

    public void setOpendate(Timestamp opendate) {
        this.opendate = opendate;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
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

    public String getCardid() {
        return cardid;
    }

    public String getCardpasswd() {
        return cardpasswd;
    }

    public String getPersonid() {
        return personid;
    }
}
