package com.fly.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.DemoService;

/**
 * @author landinguy
 * <p>
 * Created on 2018/12/22 0022.
 */
@Component
@Service(interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
