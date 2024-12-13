package com.example.banksystem.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.banksystem.conService.EmployeeInformation;
import com.example.banksystem.mapper.EmployeeMapper;
import com.example.banksystem.service.IPoiEmployeeService;
import org.springframework.stereotype.Service;

@Service
public class PoiEmployeeServiceImpl extends ServiceImpl<EmployeeMapper,EmployeeInformation> implements IPoiEmployeeService {
}
