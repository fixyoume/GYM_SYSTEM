package com.gymsystem.po;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * �û���ϸ��Ϣ
 * 
 * @author e.IT
 *
 */
public class UserMessage implements Serializable{

	private Integer userMessage_id;
	
	private String userName;
	private String address;
	private String sex;
	private Date   bornDay;  		//��������
	private String IDNumber;	//��ݺ�
	private String age;
	private String schoolName;
	private String grade;
	private String _class;
	private String phoneNumber;
	private String eMail;
	
	
	
}
