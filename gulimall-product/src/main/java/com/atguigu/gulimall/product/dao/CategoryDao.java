package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yiumky
 * @email 1780983881@qq.com
 * @date 2024-11-25 16:59:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
