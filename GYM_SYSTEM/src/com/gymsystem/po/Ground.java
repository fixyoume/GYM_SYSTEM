package com.gymsystem.po;

import java.io.Serializable;

public class Ground implements Serializable {

	private Integer ground_id;
	private String ground_number;
	private String type;
	private String location;
	private String groundName;
	private String descript;		//场地说明
	private boolean canUse;
	private long groundRentRate;	//场地租金，该字段对应的租金表可以删除，用该字段替代
	
}
