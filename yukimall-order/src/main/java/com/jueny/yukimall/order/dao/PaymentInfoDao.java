package com.jueny.yukimall.order.dao;

import com.jueny.yukimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Jueny
 * @email yjueny@163.com
 * @date 2020-09-22 15:51:52
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
