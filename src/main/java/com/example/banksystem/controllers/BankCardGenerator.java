package com.example.banksystem.controllers;
import java.security.SecureRandom;
public class BankCardGenerator {
    // 假设银行卡号的长度为16位（这是一个常见的长度，但并非所有银行卡都是16位）
    private static final int CARD_NUMBER_LENGTH = 15;

    // 发卡行标识码（BIN），这里用示例值，实际应根据银行分配
    private String BIN = "320067";

    // 用于生成随机数的SecureRandom实例
    private static final SecureRandom RANDOM = new SecureRandom();

    public  String generateCardNumber() {
        // 银行卡号的前6位是BIN
        StringBuilder cardNumber = new StringBuilder(BIN);

        // 生成剩余的随机数部分
        for (int i = BIN.length(); i < CARD_NUMBER_LENGTH; i++) {
            cardNumber.append(RANDOM.nextInt(10)); // 随机生成0-9之间的数字
        }

        // 计算并添加Luhn校验位（可选，但推荐）
        cardNumber.insert(CARD_NUMBER_LENGTH - 1, calculateLuhnCheckDigit(cardNumber.toString().substring(0, CARD_NUMBER_LENGTH - 1)));

        return cardNumber.toString();
    }

    // Luhn算法计算校验位
    private  int calculateLuhnCheckDigit(String number) {
        int sum = 0;
        boolean alternate = false;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(number.substring(i, i + 1));

            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            alternate = !alternate;
        }

        return (10 - (sum % 10)) % 10; // 返回校验位
    }
}
