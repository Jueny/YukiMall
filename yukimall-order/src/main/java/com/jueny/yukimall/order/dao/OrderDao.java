package com.jueny.yukimall.order.dao;

import com.jueny.yukimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Jueny
 * @email yjueny@163.com
 * @date 2020-09-22 15:51:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
