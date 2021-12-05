package com.graded.assesment.main;

import com.graded.assesment.model.AdminDepartment;
import com.graded.assesment.model.HRDepartment;
import com.graded.assesment.model.TechDepartment;

public class Main {
	public static void main(String[] args) {

		AdminDepartment objAdmin = new AdminDepartment();
		HRDepartment objHR = new HRDepartment();
		TechDepartment objTech = new TechDepartment();

		System.out.println("Welcome to " + objAdmin.departmentName());
		System.out.println(objAdmin.getTodaysWork());
		System.out.println(objAdmin.getWorkDeadline());
		System.out.println(objAdmin.isTodayAHoliday() + "\n");

		System.out.println("Welcome to " + objHR.departmentName());
		System.out.println(objHR.doActivity());
		System.out.println(objHR.getTodaysWork());
		System.out.println(objHR.getWorkDeadline());
		System.out.println(objHR.isTodayAHoliday() + "\n");

		System.out.println("Welcome to " + objTech.departmentName());
		System.out.println(objTech.getTodaysWork());
		System.out.println(objTech.getWorkDeadline());
		System.out.println(objTech.getTechStackInformation());
		System.out.println(objTech.isTodayAHoliday());

	}

}
