package com.gymsystem.po;

import java.io.Serializable;
import java.sql.Date;


/**
 * 
 * �������ű�
 * 
 * @author e.IT
 *
 */
public class WorkManage implements Serializable {

	private Integer workManage_id;
	
	private String manageNumber;
	private String descript;		//��������
	private String workAddress;
	
	private Date workStartTime;
	private Date workEndTime;
	
	
}
