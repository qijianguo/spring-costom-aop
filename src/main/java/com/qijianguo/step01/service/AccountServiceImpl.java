package com.qijianguo.step01.service;

import com.qijianguo.step01.dao.AccountDao;
import com.qijianguo.step01.dao.AccountDaoImpl;
import com.qijianguo.step01.pojo.Account;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao = new AccountDaoImpl();

	public Account selectByUser(Long userId) {
		return accountDao.selectByUser(userId);
	}
}
