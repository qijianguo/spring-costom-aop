package com.qijianguo.step03.dao;

import com.qijianguo.step03.pojo.Account;

import java.math.BigDecimal;

public class AccountDaoImpl implements AccountDao {

	@Override
	public Account selectByUser(Long userId) {
		Account account = new Account(1L, new BigDecimal(1000));
		return account;
	}
}
