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
@TableName("wms_ware_order_task")
public class WmsWareOrderTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private unknowType id;
	/**
	 * order_id
	 */
	private unknowType orderId;
	/**
	 * order_sn
	 */
	private unknowType orderSn;
	/**
	 * 收货人
	 */
	private unknowType consignee;
	/**
	 * 收货人电话
	 */
	private unknowType consigneeTel;
	/**
	 * 配送地址
	 */
	private unknowType deliveryAddress;
	/**
	 * 订单备注
	 */
	private unknowType orderComment;
	/**
	 * 付款方式【 1:在线付款 2:货到付款】
	 */
	private unknowType paymentWay;
	/**
	 * 任务状态
	 */
	private unknowType taskStatus;
	/**
	 * 订单描述
	 */
	private unknowType orderBody;
	/**
	 * 物流单号
	 */
	private unknowType trackingNo;
	/**
	 * create_time
	 */
	private unknowType createTime;
	/**
	 * 仓库id
	 */
	private unknowType wareId;
	/**
	 * 工作单备注
	 */
	private unknowType taskComment;

}
