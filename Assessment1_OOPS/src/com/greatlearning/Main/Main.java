/**
 * 
 */
package com.greatlearning.Main;

import com.greatlearning.deparmentsModel.*;

/**
 * @author sahit
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HrDepartment hrObj=new HrDepartment();//create an object to class HrDepartment
		TechDepartment techObj=new TechDepartment();//create an object to class TechDepartment
		AdminDepartment adminObj=new AdminDepartment();//create an object to class AdminDepartment
		
		//Call respective methods from AdminDepartment class and display the details
		System.out.println("Welcome to "+adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());
		System.out.println();
		
		//Call respective methods from HrDepartment class and display the details
		System.out.println("Welcome to "+hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());
		System.out.println();
		
		//Call respective methods from TechDepartment class and display the details
		System.out.println("Welcome to "+techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
	}

}
