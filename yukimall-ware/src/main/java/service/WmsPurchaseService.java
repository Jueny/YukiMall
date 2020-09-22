package ${package}.${moduleName}.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import ${package}.${moduleName}.entity.WmsPurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
public interface WmsPurchaseService extends IService<WmsPurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

