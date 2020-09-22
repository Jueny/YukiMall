package com.jueny.yukimall.order.dao;

import com.jueny.yukimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author Jueny
 * @email yjueny@163.com
 * @date 2020-09-22 15:51:52
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
