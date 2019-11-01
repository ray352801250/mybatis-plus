package com.ray.mybatis_plus;


import com.ray.mybatis_plus.bean.emp.ContractRecord;
import com.ray.mybatis_plus.service.emp.ContractRecordService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    ContractRecordService contractRecordService;

    @Test
    void contextLoads() {
        ContractRecord byId = contractRecordService.getById(1L);
        Assert.assertNotNull(byId);
        System.out.println(byId);

    }

}
