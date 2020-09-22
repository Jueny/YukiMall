package com.jueny.yukimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jueny.common.utils.PageUtils;
import com.jueny.yukimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author Jueny
 * @email yjueny@163.com
 * @date 2020-09-22 15:51:52
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

