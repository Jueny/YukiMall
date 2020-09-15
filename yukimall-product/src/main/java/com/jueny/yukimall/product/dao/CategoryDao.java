package com.jueny.yukimall.product.dao;

import com.jueny.yukimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Jueny
 * @email yangxuejun1996@163.com
 * @date 2020-08-18 15:10:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
