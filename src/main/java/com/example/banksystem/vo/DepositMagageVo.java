package com.example.banksystem.vo;

import java.math.BigDecimal;

public class DepositMagageVo {
    public String depositid;
    public Double interest;
    public BigDecimal limityear;
    public String remark;

    public String getDepositid() {
        return depositid;
    }

    public void setDepositid(String depositid) {
        this.depositid = depositid;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public BigDecimal getLimityear() {
        return limityear;
    }

    public void setLimityear(BigDecimal limityear) {
        this.limityear = limityear;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
