package it.heima.mapper;


import it.heima.domain.Account;

import java.util.List;

public interface AccountMapper {
    public void save(Account count);

    public List<Account> list();
}
