package ${package}.${moduleName}.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 采购信息
 * 
 * @author ${author}
 * @email ${email}
 * @date 2020-09-15 16:25:46
 */
@Data
@TableName("wms_purchase")
public class WmsPurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 采购单id
	 */
	@TableId
	private unknowType id;
	/**
	 * 采购人id
	 */
	private unknowType assigneeId;
	/**
	 * 采购人名
	 */
	private unknowType assigneeName;
	/**
	 * 联系方式
	 */
	private unknowType phone;
	/**
	 * 优先级
	 */
	private unknowType priority;
	/**
	 * 状态
	 */
	private unknowType status;
	/**
	 * 仓库id
	 */
	private unknowType wareId;
	/**
	 * 总金额
	 */
	private unknowType amount;
	/**
	 * 创建日期
	 */
	private unknowType createTime;
	/**
	 * 更新日期
	 */
	private unknowType updateTime;

}
