package com.example.banksystem.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.banksystem.conService.AccountInformation;
import com.example.banksystem.mapper.AccountMapper;
import com.example.banksystem.service.IPoiAccountService;
import org.springframework.stereotype.Service;

@Service
public class PoiAccountServiceImpI extends ServiceImpl<AccountMapper, AccountInformation> implements IPoiAccountService {
}
