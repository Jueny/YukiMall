package ${package}.${moduleName}.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 采购信息详情
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
@Data
@TableName("wms_purchase_detail")
public class WmsPurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private unknowType id;
	/**
	 * 采购单id
	 */
	private unknowType purchaseId;
	/**
	 * 采购商品id
	 */
	private unknowType skuId;
	/**
	 * 采购数量
	 */
	private unknowType skuNum;
	/**
	 * 采购金额
	 */
	private unknowType skuPrice;
	/**
	 * 仓库id
	 */
	private unknowType wareId;
	/**
	 * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
	 */
	private unknowType status;

}
