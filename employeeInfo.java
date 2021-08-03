package com.company;

import java.util.*;



public class employeeInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displayEmployeeInfo employee = new displayEmployeeInfo();

        System.out.print( "Enter Employee name: " );
        String employeeName = input.nextLine();
        employee.setEmployeeName(employeeName);

        System.out.print( "Enter hours worked: " );
        double hoursWorked = input.nextDouble();
        employee.setEmployeeHoursWorked(hoursWorked);

        System.out.print( "Enter hourly rate: " );
        double rateOfPay = input.nextDouble();
        employee.setEmployeeRateOfPay(rateOfPay);

        double overTimeWorked = hoursWorked - 40;

        double grossStraightPay = hoursWorked*rateOfPay;
        double grossOverTimePay= ((hoursWorked - 40)*(rateOfPay*1.5))+(40*rateOfPay);

        double federalTaxRate = 0.015 ;
        double stateTaxRate = 0.0307 ;
        double medicareRate = 0.0145 ;
        double socialSecurityRate = 0.062 ;
        double unemploymentInsuranceRate = 0.0007;

        double federalTaxAmount = federalTaxRate * grossOverTimePay;
        double stateTaxAmount = stateTaxRate * grossOverTimePay;
        double medicareAmount = medicareRate * grossOverTimePay ;
        double socialSecurityAmount = socialSecurityRate * grossOverTimePay ;
        double unemploymentInsuranceAmount = unemploymentInsuranceRate * grossOverTimePay;
        double totalDeductions = federalTaxAmount + stateTaxAmount + medicareAmount + socialSecurityAmount + unemploymentInsuranceAmount;
        double overTimeNetPay = grossOverTimePay - totalDeductions;
        double straightNetPay = grossStraightPay - totalDeductions;

        if (hoursWorked > 40) {
            employee.setEmployeeOverTimeWorked(overTimeWorked);
            employee.setEmployeeGrossPay(grossOverTimePay);
            employee.setEmployeeNetPay(overTimeNetPay);
            employee.setEmployeeDeductions(totalDeductions);
        }
        if (hoursWorked <= 40) {
            employee.setEmployeeGrossPay(grossStraightPay);
            employee.setEmployeeNetPay(straightNetPay);
            employee.setEmployeeDeductions(totalDeductions);
        }


        employee.displayEmployee();
        input.close();
    }
}

		
 