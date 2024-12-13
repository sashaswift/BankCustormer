package com.example.banksystem.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.banksystem.conService.TransactionItem;
import com.example.banksystem.mapper.EmployeeMapper;
import com.example.banksystem.mapper.TransactionMapper;
import com.example.banksystem.service.IPoiTransactionService;
import org.springframework.stereotype.Service;

@Service
public class PoiTransactionServiceImpl extends ServiceImpl<TransactionMapper, TransactionItem> implements IPoiTransactionService {
}
