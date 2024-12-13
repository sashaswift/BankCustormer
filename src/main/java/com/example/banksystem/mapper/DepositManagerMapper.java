package com.example.banksystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.banksystem.conService.DepositManageInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepositManagerMapper extends BaseMapper<DepositManageInformation> {
    List<String> GetByRemark(@Param("remark") String remark);
    List<DepositManageInformation> GetAll();
}
