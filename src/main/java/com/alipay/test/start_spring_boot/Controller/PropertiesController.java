package com.alipay.test.start_spring_boot.Controller;

import com.alipay.test.start_spring_boot.properties.MyProperties;
import com.alipay.test.start_spring_boot.properties.MyPropertiesTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dly on 2018/7/10
 */
@RequestMapping("/properties")
@RestController
public class PropertiesController {

    private static final Logger log = LoggerFactory.getLogger(PropertiesController.class);

    @Autowired
    private MyProperties myProperties;

    @Autowired
    private MyPropertiesTwo myPropertiesTwo;

//    @Autowired
//    public PropertiesController(MyProperties myProperties) {
//        this.myProperties = myProperties;
//    }

    @GetMapping("/1")
    public MyProperties myProperties() {
        log.info("===============================================");
        log.info(myProperties.toString());
        log.info("===============================================");
        return myProperties;
    }

    @GetMapping("/2")
    public MyPropertiesTwo myPropertiesTwo() {
        log.info("===============================================");
        log.info(myPropertiesTwo.toString());
        log.info("===============================================");
        return myPropertiesTwo;
    }

}
