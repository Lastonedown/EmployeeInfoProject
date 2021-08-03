package com.company;

public class displayEmployeeInfo {

    private String displayEmployeeName;
    private double displayRateOfPay;
    private double displayHoursWorked;
    private double displayOverTimeWorked;
    private double displayGrossPay;
    private double displayTotalAmountOfDeductions;
    private double displayNetPay;

    public void setEmployeeName (String name)
    {
        displayEmployeeName = name;
    }
    public String getEmployeeName()
    {
        return displayEmployeeName;
    }
    public void setEmployeeRateOfPay(double rateOfPay)
    {
        displayRateOfPay = rateOfPay;
    }
    public double getEmployeeRateOfPay()
    {
        return displayRateOfPay;
    }
    public void setEmployeeHoursWorked(double hoursWorked)
    {
        displayHoursWorked = hoursWorked;
    }
    public double getEmployeeHoursWorked()
    {
        return displayHoursWorked;
    }
    public void setEmployeeOverTimeWorked(double overTimeWorked) {
        displayOverTimeWorked = overTimeWorked;
    }
    public double getEmployeeOverTimeWorked() {
        return displayOverTimeWorked;
    }
    public void setEmployeeGrossPay(double grossOverTimePay) {
        displayGrossPay = grossOverTimePay;
    }
    public double getEmployeeGrossPay()
    {
        return displayGrossPay;
    }
    public void setEmployeeDeductions(double totalDeductions) {
        displayTotalAmountOfDeductions = totalDeductions;
    }
    public double getDisplayTotalAmountOfDeductions() {
        return displayTotalAmountOfDeductions;
    }
    public void setEmployeeNetPay(double overTimeNetPay) {
        displayNetPay = overTimeNetPay;
    }


    public double getDisplayNetPay() {
        return displayNetPay;
    }
    public void displayEmployee()
    {
        System.out.printf( "Employee Name: %s", getEmployeeName() );
        System.out.printf( "\nRate of Pay: %s", getEmployeeRateOfPay() );
        System.out.printf( "\nHours Worked: %s", getEmployeeHoursWorked() );
        System.out.printf( "\nOvertime Worked: %s", getEmployeeOverTimeWorked() );
        System.out.printf( "\nGross Pay: %s", getEmployeeGrossPay() );
        System.out.printf( "\nTotal Deductions: %s", getDisplayTotalAmountOfDeductions() );
        System.out.printf( "\nNet Pay: %s", getDisplayNetPay() );
    }

}


