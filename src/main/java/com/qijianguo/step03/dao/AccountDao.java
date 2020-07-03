package com.qijianguo.step03.dao;

import com.qijianguo.step03.pojo.Account;

public interface AccountDao {

	/**
     * 根据用户ID查询
	 * @param userId
     * @return
     */
	Account selectByUser(Long userId);
}
