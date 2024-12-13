package com.example.banksystem.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.banksystem.conService.DepositManageInformation;
import com.example.banksystem.mapper.DepositManagerMapper;
import com.example.banksystem.service.IPoiDepositManagerService;
import org.springframework.stereotype.Service;

@Service
public class PoiDepositManagerServiceImpl extends ServiceImpl<DepositManagerMapper, DepositManageInformation> implements IPoiDepositManagerService {
}
