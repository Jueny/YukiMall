package ${package}.${moduleName}.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 库存工作单
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WmsWareOrderTaskDetailEntity implements Serializable {
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
	 * sku_name
	 */
	private unknowType skuName;
	/**
	 * 购买个数
	 */
	private unknowType skuNum;
	/**
	 * 工作单id
	 */
	private unknowType taskId;

}
