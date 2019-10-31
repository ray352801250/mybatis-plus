package com.ray.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ray.mybatis_plus.bean.emp.CompanyTemplate;
import com.ray.mybatis_plus.bean.emp.ContractRecord;
import com.ray.mybatis_plus.dao.emp.CompanyTemplateMapper;
import com.ray.mybatis_plus.dao.emp.ContractRecordMapper;
import com.ray.mybatis_plus.service.emp.ContractRecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    CompanyTemplateMapper companyTemplateMapper;

    @Autowired
    ContractRecordMapper contractRecordMapper;

    @Autowired
    ContractRecordService contractRecordService;

    @Test
    void contextLoads() {
        CompanyTemplate companyTemplate = companyTemplateMapper.selectById(3);
        System.out.println(companyTemplate.getCompanyOrgId());
        CompanyTemplate companyTemplate1 = new CompanyTemplate();
        companyTemplate1.setTemplateNo("157191277401000001");
        companyTemplate1.setCompanyOrgId(1447139242332630571L);
        List companyTemplates = companyTemplateMapper.selectList(new QueryWrapper<>(companyTemplate1));
        System.out.println(companyTemplates.size());
        ContractRecord contractRecord = new ContractRecord();
        contractRecord.setWorkerId(1L);
        Page<ContractRecord> page = new Page<>(1L, 5);
        IPage iPage = contractRecordMapper.selectPage(page, new QueryWrapper<>(contractRecord));
        System.out.println(iPage.getRecords().size());
        System.out.println(iPage.getPages());
        HashSet<Long> ids = new HashSet<>();
        ids.add(1L);
        ids.add(2L);
        Collection<ContractRecord> contractRecords = contractRecordService.listByIds(ids);
        System.out.println(contractRecords.size());
    }

}
