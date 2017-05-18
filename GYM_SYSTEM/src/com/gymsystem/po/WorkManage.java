package com.gymsystem.po;

import java.io.Serializable;
import java.sql.Date;


/**
 * 
 * 工作安排表
 * 
 * @author e.IT
 *
 */
public class WorkManage implements Serializable {

	private Integer workManage_id;
	
	private String manageNumber;
	private String descript;		//工作描述
	private String workAddress;
	
	private Date workStartTime;
	private Date workEndTime;
	
	
}
