package com.example.banksystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.banksystem.conService.TransactionItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransactionMapper extends BaseMapper<TransactionItem> {
    void AddTransaction(@Param("transactionItem") TransactionItem transactionItem);
    List<TransactionItem> GetAllTransaction(@Param("cardid") String cardid);
}
