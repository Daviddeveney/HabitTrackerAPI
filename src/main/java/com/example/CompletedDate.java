package com.example;

import java.sql.Date;

public class CompletedDate {
	
	private long completedDateID;
	private Date date;
	private double percentCompleted;	
	
	public long getCompletedDateID() {
		return completedDateID;
	}
	public void setCompletedDateID(long completedDateID) {
		this.completedDateID = completedDateID;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPercentCompleted() {
		return percentCompleted;
	}
	public void setPercentCompleted(double percentCompleted) {
		this.percentCompleted = percentCompleted;
	}
}