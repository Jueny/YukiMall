package ${package}.${moduleName}.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品库存
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
@Data
@TableName("wms_ware_sku")
public class WmsWareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private unknowType id;
	/**
	 * sku_id
	 */
	private unknowType skuId;
	/**
	 * 仓库id
	 */
	private unknowType wareId;
	/**
	 * 库存数
	 */
	private unknowType stock;
	/**
	 * sku_name
	 */
	private unknowType skuName;
	/**
	 * 锁定库存
	 */
	private unknowType stockLocked;

}
