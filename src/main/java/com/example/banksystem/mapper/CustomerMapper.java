package com.example.banksystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.banksystem.conService.CustomerInformation;
import com.example.banksystem.conService.EmployeeInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerMapper extends BaseMapper<CustomerInformation> {
    List<CustomerInformation> getById(@Param("id") String id);
    List<CustomerInformation> getByidAndPwd(@Param("id") String id,@Param("passwd") String passwd);
    void addCustomer(@Param("customerInformation") CustomerInformation customerInformation);

    void updateCustomer(@Param("customerInformation") CustomerInformation customerInformation);
}
