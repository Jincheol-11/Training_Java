package com.mystudy.run.TrainingJava;

import com.mystudy.run.expt.InsufficientException;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account(); // accout 생성
        account.deposit(10000); // 10000원을 account에 예금
        System.out.println("예금액: " + account.getBalance()); // getBalance() : 잔액 호출

        try {
            account.withdraw(30000); // 30000원 인출을 시도해보고 안되면 예외처리로 던져라.
        } catch (InsufficientException e) { // 10000원 이기에 예외 발생 e.getMessage 출력
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}

