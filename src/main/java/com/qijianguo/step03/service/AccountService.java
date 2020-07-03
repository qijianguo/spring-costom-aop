package com.qijianguo.step03.service;

import com.qijianguo.step03.pojo.Account;

public interface AccountService {

	Account selectByUser(Long userId);

	void transfer(Long userA, Long userB, int account);
}
