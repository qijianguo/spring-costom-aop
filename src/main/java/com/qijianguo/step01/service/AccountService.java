package com.qijianguo.step01.service;

import com.qijianguo.step01.pojo.Account;

public interface AccountService {

	Account selectByUser(Long userId);
}
