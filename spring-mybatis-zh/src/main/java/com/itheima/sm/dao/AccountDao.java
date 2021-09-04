package com.itheima.sm.dao;

import com.itheima.sm.domain.Account;
import org.apache.ibatis.annotations.Param;

/**
 * @Author byZhao
 * @Modify 2021/9/4 18:54
 * Talk is cheap. Show me the code.
 */
public interface AccountDao {

    void insertAccount(@Param("ac") Account account);

}
