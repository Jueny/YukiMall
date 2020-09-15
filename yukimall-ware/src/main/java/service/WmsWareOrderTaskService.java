package ${package}.${moduleName}.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import ${package}.${moduleName}.entity.WmsWareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
public interface WmsWareOrderTaskService extends IService<WmsWareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

