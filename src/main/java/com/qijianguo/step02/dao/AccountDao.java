package com.qijianguo.step02.dao;

import com.qijianguo.step02.pojo.Account;

public interface AccountDao {

	/**
     * 根据用户ID查询
	 * @param userId
     * @return
     */
	Account selectByUser(Long userId);
}
