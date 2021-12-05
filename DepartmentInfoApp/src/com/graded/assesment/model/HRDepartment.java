package com.graded.assesment.model;

public class HRDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill Today's Timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}

}
