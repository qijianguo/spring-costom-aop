package com.qijianguo.step02.service;

import com.qijianguo.step02.pojo.Account;

public interface AccountService {

	Account selectByUser(Long userId);

	void transfer(Long userA, Long userB, int account);
}
