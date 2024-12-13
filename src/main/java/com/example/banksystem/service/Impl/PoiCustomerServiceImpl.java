package com.example.banksystem.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.banksystem.conService.CustomerInformation;
import com.example.banksystem.mapper.CustomerMapper;
import com.example.banksystem.service.IPoiCustomerService;
import org.springframework.stereotype.Service;

@Service
public class PoiCustomerServiceImpl extends ServiceImpl<CustomerMapper, CustomerInformation> implements IPoiCustomerService {
}
