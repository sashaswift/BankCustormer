package com.example.banksystem.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

public class DepositVo {
    public String id;
    public String depositid;
    public Timestamp startdate;
    public String cardid;
    public BigDecimal depositbalance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepositid() {
        return depositid;
    }

    public void setDepositid(String depositid) {
        this.depositid = depositid;
    }

    public Timestamp getStartdate() {
        return startdate;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public BigDecimal getDepositbalance() {
        return depositbalance;
    }

    public void setDepositbalance(BigDecimal depositbalance) {
        this.depositbalance = depositbalance;
    }
}
