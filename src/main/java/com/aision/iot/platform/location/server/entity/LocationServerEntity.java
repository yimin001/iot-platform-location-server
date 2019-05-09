package com.aision.iot.platform.location.server.entity;


import com.aision.iot.platform.parent.entity.BaseEntity;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

/**
 * @author yim
 * @description 定位服务器实体
 * @date 2019/4/26
 */
@Entity
@Table(name = "t_location_server", schema = "equipment_schema")
@Data
@ToString
public class LocationServerEntity extends BaseEntity {
	/**
	 * 服务器名(编号)
	 */
	@Column(name = "server_name")
	@ApiParam("服务器名(编号)")
	private String serverName;

	/**
	 * 服务器IP
	 */
	@Column(name = "server_ip")
	@ApiParam("服务器IP")
	private String serverIp;

	/**
	 * 服务器
	 */
	@Column(name = "server_id")
	@ApiParam("服务器")
	private String serverId;

	/**
	 * 厂家
	 */
	@Column(name = "factory")
	@ApiParam("厂家")
	private String factory;

	/**
	 * 序列号
	 */
	@Column(name = "serial_no")
	@ApiParam("序列号")
	private String serialNo;

	/**
	 * 硬件版本
	 */
	@Column(name = "hardware_version")
	@ApiParam("硬件版本")
	private String hardwareVersion;

	/**
	 * 软件版本
	 */
	@Column(name = "soft_version")
	@ApiParam("软件版本")
	private String softVersion;

	/**
	 * 网关
	 */
	@Column(name = "gateway")
	@ApiParam("网关")
	private String gateway;

	/**
	 * 子网掩码
	 */
	@Column(name = "subnet_mask")
	@ApiParam("子网掩码")
	private String subnetMask;

	/**
	 * 批次
	 */
	@Column(name = "batch_no")
	@ApiParam("批次")
	private String batchNo;

	/**
	 * 公司表ID
	 */
	@Column(name = "company_id")
	@ApiParam("公司表ID")
	private String companyId;

	/**
	 * 使用日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "enabled_date")
	@ApiParam("使用日期")
	private Date enabledDate;
	/**
	 * 状态
	 * 0：离线  1：在线
	 */
	@Column(name = "status")
	@ApiParam(value = "状态", example = "1")
	private Integer status;

	@Column(name = "allocation_recall")
	@ApiParam(value = "分配标识", example = "1")
	private Integer allocationRecall = 0;

}
