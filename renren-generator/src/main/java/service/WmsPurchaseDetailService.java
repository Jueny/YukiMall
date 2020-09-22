package ${package}.${moduleName}.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import ${package}.${moduleName}.entity.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 采购信息详情
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

