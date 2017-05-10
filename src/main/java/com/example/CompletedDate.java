package com.example;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;

@Entity
@Table(name="completeddate")
public class CompletedDate implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name ="percentCompleted")
	private double percentCompleted;	
	
	protected CompletedDate(){}
	
	public CompletedDate(Date date, double percentCompleted){
		this.date = date;
		this.percentCompleted = percentCompleted;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, date, percentCompleted);
    }
	
}