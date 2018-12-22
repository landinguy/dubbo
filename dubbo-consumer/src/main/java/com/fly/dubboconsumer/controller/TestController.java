package com.fly.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DemoService;

/**
 * @author landinguy
 * @date 2018/12/22 0022
 */
@Slf4j
@RestController
public class TestController {

    @Reference
    private DemoService demoService;

    @RequestMapping("/add")
    public String add(Integer a, Integer b) {
        log.info("a#{},b#{}", a, b);
        Integer sum = demoService.add(a, b);
        String result = a + "+" + b + "=" + sum;
        log.info(result);
        return result;
    }
}
