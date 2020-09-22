package ${package}.${moduleName}.dao;

import ${package}.${moduleName}.entity.WmsPurchaseDetailEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息详情
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
@Mapper
public interface WmsPurchaseDetailDao extends BaseMapper<WmsPurchaseDetailEntity> {
	
}
