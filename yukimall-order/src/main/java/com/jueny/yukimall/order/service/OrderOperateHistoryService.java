package com.jueny.yukimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jueny.common.utils.PageUtils;
import com.jueny.yukimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author Jueny
 * @email yjueny@163.com
 * @date 2020-09-22 15:51:52
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

