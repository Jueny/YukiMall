package ${package}.${moduleName}.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 仓库信息
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
@Data
@TableName("wms_ware_info")
public class WmsWareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private unknowType id;
	/**
	 * 仓库名
	 */
	private unknowType name;
	/**
	 * 仓库地址
	 */
	private unknowType address;
	/**
	 * 区域编码
	 */
	private unknowType areacode;

}
