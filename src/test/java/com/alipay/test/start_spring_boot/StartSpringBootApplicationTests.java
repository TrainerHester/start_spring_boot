package com.alipay.test.start_spring_boot;

import com.alipay.test.start_spring_boot.entity.GoodsCategoryVo;
import com.alipay.test.start_spring_boot.mapper.GoodsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartSpringBootApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMybatisApplicationTests.class);

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void contextLoads() throws Exception{
        final List<GoodsCategoryVo> output = goodsMapper.getCategory(0);
        log.info("[根据用户名查询] - [{}]", output);
    }



}
