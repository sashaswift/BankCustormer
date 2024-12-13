package com.example.banksystem.conService;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

@TableName("Transaction")
public class TransactionItem {
    @TableId("accountid")
    public String accountid;
    public Timestamp transactiondate;
    public String reccardid;
    public String acpcardid;
    public String transactiontype;
    public BigDecimal amount;

    public String getAccountid() {
        return accountid;
    }

    public Timestamp getTransactiondate() {
        return transactiondate;
    }

    public String getReccardid() {
        return reccardid;
    }

    public String getAcpcardid() {
        return acpcardid;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public void setTransactiondate(Timestamp transactiondate) {
        this.transactiondate = transactiondate;
    }

    public void setReccardid(String recardid) {
        this.reccardid = recardid;
    }

    public void setAcpcardid(String acpcardid) {
        this.acpcardid = acpcardid;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
