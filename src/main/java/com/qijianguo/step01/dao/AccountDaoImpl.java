package com.qijianguo.step01.dao;

import com.qijianguo.step01.pojo.Account;

import java.math.BigDecimal;

public class AccountDaoImpl implements AccountDao {

	public Account selectByUser(Long userId) {
		Account account = new Account(1L, new BigDecimal(1000));
		return account;
	}
}
