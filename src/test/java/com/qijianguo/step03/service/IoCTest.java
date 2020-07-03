package com.qijianguo.step03.service;

import com.qijianguo.step03.pojo.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {

    @Test
    public void selectByUserTest() {
    	// 通过读取classpath下的xml配置文件启动容器
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		Account account = accountService.selectByUser(1L);
    }

}