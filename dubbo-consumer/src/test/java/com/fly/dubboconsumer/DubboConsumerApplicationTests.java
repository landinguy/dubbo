package com.fly.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.DemoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Reference
    private DemoService demoService;

    @Test
    public void dubboTest() {
        Integer sum = demoService.add(520, 1314);
        System.out.println("sum: " + sum);
    }

}

