package com.jueny.yukimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jueny.common.utils.PageUtils;
import com.jueny.yukimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author Jueny
 * @email yjueny@163.com
 * @date 2020-09-22 15:51:52
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

