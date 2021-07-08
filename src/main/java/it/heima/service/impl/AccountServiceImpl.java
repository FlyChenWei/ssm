package it.heima.service.impl;

import it.heima.domain.Account;
import it.heima.mapper.AccountMapper;
import it.heima.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper mapper;

    public void save(Account count) {
        mapper.save(count);
    }
    public List<Account> list() {
        List<Account> list = mapper.list();
        return  list;
    }

   /* public void save(Account count) {
        System.out.println("save 内部");
        System.out.println(count);
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
            System.out.println(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("出错");
        }
        System.out.println("2");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        System.out.println("1");
        SqlSession sqlSession=null;
        try{
            sqlSession = factory.openSession(true);
            System.out.println(".......");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("出错");
        }


        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        System.out.println("mm");
        mapper.save(count);

    }*/

    /*public List<Account> list() {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory fa = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = fa.openSession(true);

        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> list = mapper.list();
        return list;
    }*/

}
