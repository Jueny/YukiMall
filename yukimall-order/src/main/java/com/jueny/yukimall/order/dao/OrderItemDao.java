package com.jueny.yukimall.order.dao;

import com.jueny.yukimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Jueny
 * @email yjueny@163.com
 * @date 2020-09-22 15:51:52
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
