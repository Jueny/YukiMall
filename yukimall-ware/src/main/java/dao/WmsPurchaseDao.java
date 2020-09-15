package ${package}.${moduleName}.dao;

import ${package}.${moduleName}.entity.WmsPurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
@Mapper
public interface WmsPurchaseDao extends BaseMapper<WmsPurchaseEntity> {
	
}
