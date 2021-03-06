package com.qijianguo.step01.dao;

import com.qijianguo.step01.pojo.Account;

public interface AccountDao {

	/**
	 * 根据用户ID查询
	 * @param userId
	 * @return
	 */
	Account selectByUser(Long userId);
}
