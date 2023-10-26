package com.mystudy.run.TrainingJava;

import com.mystudy.run.expt.InsufficientException;

public class Account {
    private long balance; // 잔액을 나타냄

    public Account() {}
    public long getBalance() { //현재 잔액 반환
        return balance;
    }
    public void deposit(int money) { // 예금액을 나타냄. 금액+잔액
        balance += money;
    }
    public void withdraw(int money) throws InsufficientException { //잔액이 인출액(필요한 돈)보다 더 적다면 예외 발생
        if(balance < money) {
            throw new InsufficientException("잔고 부족: " + (money-balance) + " 모자람");
        }
        balance -= money; // 잔액에서 인출액 빼기
    }
}
