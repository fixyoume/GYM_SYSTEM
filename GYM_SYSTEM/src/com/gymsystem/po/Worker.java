package com.gymsystem.po;

import java.io.Serializable;
import java.sql.Date;

import javax.enterprise.inject.Default;

public class Worker implements Serializable {

	private Integer worker_id;
	private String workerNumber;
	private boolean sex ;		//true ÎªÄÐ£¬ false Îª Å®£»
	private int age;
	private String phone;
	private String email;
	private String IDNumber;
	private Date entryTime;
	private Date dimissionTime;
	
	
	
}
