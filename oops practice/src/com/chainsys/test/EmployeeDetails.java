package com.chainsys.test;

import java.util.Arrays;
import java.util.Scanner;

import com.chainsys.model.Company;
import com.chainsys.model.Employee;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter company name :");
		String companyName=sc.nextLine();
		System.out.println("number of employees");
		int size=sc.nextInt();
		Employee[] employees= new Employee[size];
        System.out.println("Enter employee details:");
		for(int i=0;i<size;i++) {
			System.out.println("Employee "+(i+1));
		
			System.out.println("Enter employee id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter designation:");
			String designation=sc.next();
			System.out.println("Enter salary");
			double salary=sc.nextDouble();
			 
			employees[i]=new Employee(id,name,designation,salary);
		}
	   Company company=new Company(companyName,employees,size);
	   System.out.println("Average Salary "+ company.getAverageSalary(employees));
	   System.out.println("Max Salary "+company.getMaxSalary(employees));
	   System.out.println("Designation: Engineer "+Arrays.toString(company.getEmployeesByDesignation("Engineer", employees)));
	
				
		

	}

}
