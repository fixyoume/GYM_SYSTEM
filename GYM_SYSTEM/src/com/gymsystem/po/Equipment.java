package com.gymsystem.po;

import java.io.Serializable;
import java.util.Date;

public class Equipment implements Serializable{
	private Integer equipment_id;
	private String type;
	private String name;
	private String location;
	private String rate;
	private Date buyTime;
	private Date distroyTime;
	private boolean canUse;
	private String equipmentNumber;
}
