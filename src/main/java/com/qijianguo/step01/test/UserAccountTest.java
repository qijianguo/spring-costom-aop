package com.qijianguo.step01.test;

import com.qijianguo.step01.pojo.Account;
import com.qijianguo.step01.service.AccountService;
import com.qijianguo.step01.service.AccountServiceImpl;

public class UserAccountTest {


	public static void main(String[] args) {
		step01();
	}

	/**
	 * 传统方式：new
	 * AccountService accountService = new AccountServiceImpl();
	 */
	private static void step01() {
		AccountService accountService = new AccountServiceImpl();
		Account account = accountService.selectByUser(1L);
		System.out.println(account);
	}
}
