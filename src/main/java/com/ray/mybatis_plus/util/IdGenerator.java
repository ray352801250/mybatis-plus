package com.ray.mybatis_plus.util;

import java.util.List;

/**
 * 主键生成器
 * @author zhangguosheng
 */
public interface IdGenerator {

    /**
     * 获取一个主键
     * @return
     */
    Long generate();

    /**
     * 批量获取主键
     * @return
     */
    List<Long> generateBatch(int count);

}