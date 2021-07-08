package it.heima.service;


import it.heima.domain.Account;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    //保存方法
    void save(Account count) ;

    //查询方法
    List<Account> list();

}
