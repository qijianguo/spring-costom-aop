package com.qijianguo.step02.service;

import com.qijianguo.step02.dao.AccountDao;
import com.qijianguo.step02.dao.AccountDaoImpl;
import com.qijianguo.step02.factory.BeanFactory;
import com.qijianguo.step02.pojo.Account;

public class AccountServiceImpl implements AccountService {

	// 原始
	//private AccountDao accountDao = new AccountDaoImpl();
	// 工厂模式
	//private AccountDao accountDao = (AccountDao) BeanFactory.getBean("accountDao");
	//
	private AccountDao accountDao;
	@Override
	public Account selectByUser(Long userId) {
		Account account = accountDao.selectByUser(userId);
		System.out.println(account);
		return account;
	}

	@Override
	public void transfer(Long userA, Long userB, int account) {
		System.out.println("b消费了" + account + "元");
		System.out.println("A收入了" + account + "元");
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
