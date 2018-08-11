package com.alipay.test.start_spring_boot;

import com.alipay.test.start_spring_boot.entity.UserLowCarbon;
import com.alipay.test.start_spring_boot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
;import java.util.List;

/**
 * Created by dly on 2018/7/13
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(SpringBootMybatisApplicationTests.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() throws Exception {
        final List<UserLowCarbon> output = userMapper.findByUserId("u_001");
        log.info("[根据用户名查询] - [{}]", output);
    }


}
