package com.qijianguo.step02.service;

import com.qijianguo.step02.factory.ProxyFactory;
import com.qijianguo.step02.factory.BeanFactory;
import com.qijianguo.step02.pojo.Account;
import org.junit.Test;

public class AccountServiceImplTest {

	// 从Bean工厂中获取对象
	private AccountService accountService = (AccountService) BeanFactory.getBean("accountService");

	// 从代理工厂中获取代理对象
	private AccountService accountServiceProxy = (AccountService) ProxyFactory.getInstance().getProxy(BeanFactory.getBean("accountService"));

    @Test
    public void selectByUserTest() {
		Account account = accountService.selectByUser(1L);
    }

	@Test
	public void transferTest() {
		accountServiceProxy.transfer(1L, 2L, 100);
	}
}