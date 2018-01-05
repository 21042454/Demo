package com.fox.service;

import com.fox.dao.TestDao;
import com.fox.util.SpringContextUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class TestService {

    public TestService(){
        System.out.println("TestService:初始化成功");
    }

}
