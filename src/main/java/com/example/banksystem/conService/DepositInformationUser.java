package com.example.banksystem.conService;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

@TableName("Depositcard")
public class DepositInformationUser {
    @TableId("id")
    public String id;
    public String depositid;
    public Timestamp startdate;
    public String cardid;
    public BigDecimal depositbalance;

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public void setDepositbalance(BigDecimal depositbalance) {
        this.depositbalance = depositbalance;
    }

    public void setDepositid(String depositid) {
        this.depositid = depositid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    public String getCardid() {
        return cardid;
    }

    public BigDecimal getDepositbalance() {
        return depositbalance;
    }

    public Timestamp getStartdate() {
        return startdate;
    }

    public String getDepositid() {
        return depositid;
    }

    public String getId() {
        return id;
    }
}
