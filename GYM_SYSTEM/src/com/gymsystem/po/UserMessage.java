package com.gymsystem.po;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * 用户详细信息
 * 
 * @author e.IT
 *
 */
public class UserMessage implements Serializable{

	private Integer userMessage_id;
	
	private String userName;
	private String address;
	private String sex;
	private Date   bornDay;  		//出生日期
	private String IDNumber;	//身份号
	private String age;
	private String schoolName;
	private String grade;
	private String _class;
	private String phoneNumber;
	private String eMail;
	
	
	
}
