package com.example.banksystem.conService;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;

@TableName("Depositmanage")
public class DepositManageInformation {
    @TableId("depositid")
    public String depositid;
    public Double interest;
    public BigDecimal limityear;
    public String remark;

    public void setDepositid(String depositid) {
        this.depositid = depositid;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public void setLimityear(BigDecimal limityear) {
        this.limityear = limityear;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDepositid() {
        return depositid;
    }

    public BigDecimal getLimityear() {
        return limityear;
    }

    public Double getInterest() {
        return interest;
    }

    public String getRemark() {
        return remark;
    }

}
