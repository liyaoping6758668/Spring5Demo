package com.ping.service.impl;

import com.ping.dao.IAccountDao;
import com.ping.dao.impl.AccountDaoImpl;
import com.ping.service.IAccountService;

/**
 * @author:lyp
 * @date 2020/1/31-11:57
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();// 此处的依赖关系有待解决

    public AccountServiceImpl() {
        System.out.println("创建对象");
    }

    @Override

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
