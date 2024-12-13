package com.example.banksystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.banksystem.conService.DepositInformationUser;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface DepositMapper extends BaseMapper<DepositInformationUser> {
    List<DepositInformationUser> GetById(@Param("id") String id);
    //void AddDeposit(@Param("depositInformationUser") DepositInformationUser depositInformationUser);
    //void UpdateDeposit(@Param("depositInformationUser") DepositInformationUser depositInformationUser);
    void AddDeposit(@Param("vdepositid") String vdepositid, @Param("vcardid") String vcardid,@Param("vamount") BigDecimal vamount);
    void UpdateDepositAdd(@Param("vdepositid") String vdepositid, @Param("vcardid") String vcardid,@Param("vamount") BigDecimal vamount);
    void UpdateDepositWith(@Param("vdepositid") String vdepositid, @Param("vcardid") String vcardid,@Param("vamount") BigDecimal vamount);
    List<DepositInformationUser> GetAllKinds(@Param("cardid") String cardid);
    List<DepositInformationUser> GetByIdAndKinds(@Param("cardid") String cardid,@Param("remark") String remark);
    void DeleteById (@Param("id") String id);

}
