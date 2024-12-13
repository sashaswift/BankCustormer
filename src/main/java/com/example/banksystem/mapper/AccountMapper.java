package com.example.banksystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.banksystem.conService.AccountInformation;
import com.example.banksystem.conService.EmployeeInformation;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface AccountMapper extends BaseMapper<AccountInformation> {
    List<AccountInformation> GetByIDAndPwd(@Param("cardid") String cardid,@Param("cardpasswd") String cardpasswd);

    List<AccountInformation> GetByID(@Param("cardid") String cardid);

    void PutDownBalance(@Param("accountInformation")AccountInformation accountInformation);
    void AddAccount(@Param("accountInformation")AccountInformation accountInformation);
}
