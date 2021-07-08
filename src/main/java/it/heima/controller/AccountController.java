package it.heima.controller;


import it.heima.domain.Account;
import it.heima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService service;

    @RequestMapping(value = "/save",produces = "text/html;harset=UTF-8")  //设置响应编码
    @ResponseBody
    public String save(Account count) {
        System.out.println("save....");
        service.save(count);
        return "保存成功";

    }
@RequestMapping(value = "/list",produces = "text/html;harset=UTF-8")
    public ModelAndView list(ModelAndView mv) {
    List<Account> list = service.list();
    mv.addObject("list",list);
    mv.setViewName("list");
    return mv;
    }
}
