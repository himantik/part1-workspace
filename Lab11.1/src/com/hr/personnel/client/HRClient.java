/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

  public static void main(String[] args) {
    // create Department object
    Department dept = new Department("Sales", "Seattle");
    System.out.println(dept);


    // add Employees to it

    dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000,2,2), 40.0, 60));
    dept.addEmployee(new SalariedEmployee("Brandon", LocalDate.of(1991, 9, 27), 2300));
    dept.addEmployee(new HourlyEmployee("Geena", LocalDate.of(2000, 2, 2), 40.0, 60));
    dept.addEmployee(new SalariedEmployee("Geena", LocalDate.of(2000,2, 2 ), 2690));

    // list its Employees
    System.out.println("\nList employees:");
    dept.listEmployees();

    // make its Employees work
    System.out.println("\nMake employees work:");
    dept.workEmployees();

    System.out.printf("\nPay  employee:");
    dept.payEmployees();
  }
}