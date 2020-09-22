package ${package}.${moduleName}.dao;

import ${package}.${moduleName}.entity.WmsWareOrderTaskDetailEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
@Mapper
public interface WmsWareOrderTaskDetailDao extends BaseMapper<WmsWareOrderTaskDetailEntity> {
	
}
