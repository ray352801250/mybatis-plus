package com.ray.mybatis_plus.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ray.mybatis_plus.bean.emp.ContractRecord;
import com.ray.mybatis_plus.service.emp.ContractRecordService;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;



/**
 * @Description:
 * @Author ray
 * @Date 2019/11/1 14:08
 * @Version
 **/

@Slf4j
//@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest()
public class ContractRecordServiceTest {

    @Autowired
    ContractRecordService contractRecordService;


    @Test
    public void CRUDTest() {
        //新增
        ContractRecord testSave3 = new ContractRecord();
        testSave3.setCompanyOrgId(1447136276899120174L);
        testSave3.setWorkerId(1447128320502109662L);
        testSave3.setContractNo("157198840001000011");
        testSave3.setStatus(0);
        testSave3.setId(1L);
        boolean save = contractRecordService.save(testSave3);
        Assert.isTrue(save, "插入测试 失败");
        log.debug("【测试id回显#testSave3.getId()】= {}", testSave3.getId());


        //查询
        ContractRecord contractRecord = contractRecordService.getById(1L);
        Assert.notNull(contractRecord, "修改测试 失败");

        //查询全部
        List<ContractRecord> list = contractRecordService.list(new QueryWrapper<>());
        Assert.isTrue(!CollectionUtils.isEmpty(list), "查询全部 失败");
        log.debug("【list】= {}", list);

        //x修改
        contractRecord.setStatus(1);
        boolean b = contractRecordService.updateById(contractRecord);
        Assert.isTrue(b, "修改测试 失败");
        ContractRecord update = contractRecordService.getById(1L);
        Assert.isTrue(update.getStatus() == 1, "修改测试 失败");
        log.debug("【update】= {}", update);

        //分页查询
        int count = contractRecordService.count(new QueryWrapper<>());
        Page<ContractRecord> userPage = new Page<>(1, 5);
        userPage.setDesc("id");
        IPage<ContractRecord> page = contractRecordService.page(userPage, new QueryWrapper<>());
        Assert.isTrue(5 == page.getSize(), "分页查询失败");
        Assert.isTrue(count ==page.getTotal(), "分页查询失败");
        log.debug("【page.getRecords()】= {}", page.getRecords());

        //删除
        boolean remove = contractRecordService.removeById(1L);
        Assert.isTrue(remove, "删除测试 失败");
        ContractRecord byId = contractRecordService.getById(1L);
        Assert.isTrue(byId == null, "删除测试 失败");
    }


    /**
     * 测试Mybatis-Plus 批量新增
     */
    @Test
    public void testSaveList() {
        List<ContractRecord> contractRecordList = Lists.newArrayList();
        ContractRecord contractRecord = new ContractRecord();
        contractRecord.setCompanyOrgId(1447136276899120174L);
        contractRecord.setWorkerId(1447128320502109662L);
        contractRecord.setContractNo("157198840001000011");
        contractRecord.setStatus(0);
        contractRecord.setId(1L);
        contractRecordList.add(contractRecord);
        boolean batch = contractRecordService.saveBatch(contractRecordList);
        Assert.isTrue(batch, "批量插入测试 失败");
        List<Long> ids = contractRecordList.stream().map(ContractRecord::getId).collect(Collectors.toList());
        log.debug("【userList#ids】= {}", ids);

        //删除
        boolean remove = contractRecordService.removeById(1L);
        Assert.isTrue(remove, "删除测试 失败");
        ContractRecord byId = contractRecordService.getById(1L);
        Assert.isTrue(byId == null, "删除测试 失败");

    }



//    /**
//     * 测试Mybatis-Plus 分页排序查询
//     */
//    @Test
//    public void testQueryByPageAndSort() {
//        int count = contractRecordService.count(new QueryWrapper<>());
//        Page<ContractRecord> userPage = new Page<>(1, 5);
//        userPage.setDesc("id");
//        IPage<ContractRecord> page = contractRecordService.page(userPage, new QueryWrapper<>());
//        Assert.isTrue(5 == page.getSize(), "分页查询失败");
//        Assert.isTrue(count ==page.getTotal(), "分页查询失败");
//        log.debug("【page.getRecords()】= {}", page.getRecords());
//    }
//
//    /**
//     * 测试Mybatis-Plus 自定义查询
//     */
//    @Test
//    public void testQueryByCondition() {
//        initData();
//        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.like("name", "Save1").or().eq("phone_number", "17300000001").orderByDesc("id");
//        int count = userService.count(wrapper);
//        Page<User> userPage = new Page<>(1, 3);
//        IPage<User> page = userService.page(userPage, wrapper);
//        Assert.assertEquals(3, page.getSize());
//        Assert.assertEquals(count, page.getTotal());
//        log.debug("【page.getRecords()】= {}", page.getRecords());
//    }
}
