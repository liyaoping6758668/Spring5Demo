package com.ping.controller;

import com.ping.dao.IAccountDao;
import com.ping.service.IAccountService;
import javafx.application.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author:lyp
 * @date 2020/1/31-12:14
 */
public class ClientTest {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        System.out.println("service对象："+accountService);
        IAccountDao accountDao = (IAccountDao) applicationContext.getBean("accountDao");
        System.out.println("dao对象："+accountDao);*/
        /**
         * BeanFactory
         */


        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("bean.xml"));
        IAccountService accountService = (IAccountService) beanFactory.getBean("accountService");
        System.out.println("service对象："+accountService);
        IAccountDao accountDao = (IAccountDao) beanFactory.getBean("accountDao");
        System.out.println("dao对象："+accountDao);
    }
}
