package com.jueny.yukimall.coupon.dao;

import com.jueny.yukimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author Jueny
 * @email yjueny@163.com
 * @date 2020-09-25 16:35:30
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}