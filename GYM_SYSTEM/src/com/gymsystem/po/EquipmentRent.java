package com.gymsystem.po;

import java.io.Serializable;
import java.util.Date;

public class EquipmentRent implements Serializable{
	
	private Integer requipmentRent_id;
	
	private Date rentTime;
	private Date returnTime;
	private String rentRate;		//���
	private int number;
	private String canUse;
	private String usage;			//��;
	
	
}
