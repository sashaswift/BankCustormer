package com.example.banksystem.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.banksystem.conService.DepositInformationUser;
import com.example.banksystem.mapper.DepositMapper;
import com.example.banksystem.service.IPoiDepositService;
import org.springframework.stereotype.Service;

@Service
public class PoiDepositServiceImpl extends ServiceImpl<DepositMapper, DepositInformationUser> implements IPoiDepositService {
}
