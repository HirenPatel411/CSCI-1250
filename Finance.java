//Name:		Hiren Patel 
//Class:	CSCI 1250-002
//Lab:		Project 2 - Extension file
//Date:		3-7-2019
//Purpose:	Extension file of Project 2 for use of methods within class

import java.util.Scanner;
/**	Class Name: class name here <br>* 
* 	Class Purpose: class purpose here <br>** <hr>* 
*	Date created: date here <br>* 
* 	Date last modified: date here* @author student’s name here*/

public class Finance
{	
//+grossPay(hours:double,rate:double):double
/**
* Method Name: grossPay <br>
* Method Purpose: To calculate gross pay <br>
* 
* <hr>
* Date created: 2/26/2019 <br>
* Date last modified: 2/28/2019 <br>
*
<hr>
* Multiply hours by rate
* 
*
* <hr>
*	@param1 double  hours; hours employee worked in pay period
*	@param2 double rate; employees hourly pay rate
*	@return dgrossPay; employees gross payment for every pay period
*/
	public static double grossPay(double hours, double rate)
	{
		double doverTime;
		double dgrossPay = 0;
		if(hours>160)
		{
			doverTime= (hours - 160);
			dgrossPay = 160*rate;
			dgrossPay= dgrossPay+(doverTime*(rate*1.5));
		}//end if
		else
		{
			dgrossPay=(hours*rate);
		}//end else
		
		return dgrossPay;
	}//end grossPay(double, double)
	
	
//+fica(gross:double):double
/**
* Method Name: fica <br>
* Method Purpose: To calculate FICA <br>
* 
* <hr>
* Date created: 2/26/2019 <br>
* Date last modified: 2/28/2019 <br>
*
<hr>
* Multiply percentage by gross
* 
*
* <hr>
*	@param1 double gross; employees gross pay for pay period
*	@return dfica; the amount of social security withheld
*/
	public static double fica(double gross)
	{
		double dfica = 0;
		if(gross>=8000.00)
		{
			dfica = (.075*8000.00);
		}//end if
		else if(gross<8000.00)
		{
			dfica = (.075*gross);
		}//end else
					
		return dfica;
			
	}//end fica(double)
	
	
//+incomeTax(gross:double,dependents:int):double
/**
* Method Name: incomeTax <br>
* Method Purpose: To calculate the income tax <br>
* 
* <hr>
* Date created: 2/26/2019 <br>
* Date last modified: 2/28/2019 <br>
*
<hr>
* Subtract the percentage rate from gross income 
* 
*
* <hr>
*	@param1 double gross; employees gross pay for pay period
*	@param2 int dependents; number of counting on persons pay
*	@return dincomeTax; returns the employees income tax owed
*/
	public static double incomeTax(double gross, int dependents)
	{
		double dincomeTax = 0;
		if(gross>=10000)
		{
			switch(dependents)
			{
				case 0:
					dincomeTax = (.25*gross);
					break;
				case 1:
				case 2:
				case 3:
				case 4:
					dincomeTax = (.25-(dependents*.01))*gross;
					break;
				case 5:
				case 6:
					dincomeTax = (.25-(.01*4)-(dependents-4)*.005)*gross;
					break;
				default:
					dincomeTax = (.18*gross);
			}//end switch
		}//end if
		else if(7500<=gross && gross<10000)
		{
			switch(dependents)
			{
				case 0:
					dincomeTax = (.20*gross);
					break;
				case 1:
				case 2:
				case 3:
				case 4:
					dincomeTax = (.20-(dependents*.0075))*gross;
					break;
				case 5:
				case 6:
					dincomeTax = (.20-(.0075*4)-(dependents-4)*.01)*gross;
					break;
				default:
					dincomeTax = (.14*gross);
			}//end switch
		}//end else if
		else if(5000<=gross && gross<7500)
		{
			switch(dependents)
			{
				case 0:
					dincomeTax = (.15*gross);				
					break;
				case 1:
				case 2:
				case 3:
				case 4:
					dincomeTax = (.15-(dependents*.01))*gross;
					break;
				default:
					dincomeTax = (.10*gross);
			}//end switch
		}//end else if
		else if(gross<5000)
		{
			switch(dependents)
			{
				case 0:
					dincomeTax = (.13*gross);
					break;
				case 1:
				case 2:
				case 3:
				case 4:
					dincomeTax = (.13-(dependents*.01))*gross;
					break;
				default:
					dincomeTax = 0;
			}//end switch
		}//end else if
		return dincomeTax;	
	}//end incomeTax(double, int)
	
		
//+insurance(gender:char, age:int,family:boolean):double
/**
* Method Name: insurance <br>
* Method Purpose: To calculate the payment of your insurance <br>
* 
* <hr>
* Date created: 2/28/2019 <br>
* Date last modified: 3/1/2019 <br>
*
<hr>
* Payment is determined by gender, age, and if you have family insurance
* 
*
* <hr>
*	@param1 char gender; gender of the employee
*	@param2 int age; age of the employee
*	@param3 boolean family; determines if employee has family insurance
*	@return dinsurance; insurance payment
*/
	public static double insurance(char gender, int age, boolean family)
	{
		double dinsurance = 200.00;
		if(gender=='M'|| gender=='m')
		{
			dinsurance = dinsurance + 25.00;
		}//end if
		if(family==true)
		{
			dinsurance = dinsurance + 100.00;
		}//end if
		if(age>50)
		{
			dinsurance = dinsurance + 25.00;
		}//end if
		
		return dinsurance;	
	}//end insurance(char, int, boolean)
	
	
//+deductions(fica:double,tax:double,insurance:double):double
/**
* Method Name: deductions <br>
* Method Purpose: calculates total deductions in employees pay <br>
* 
* <hr>
* Date created: 2/28/2019 <br>
* Date last modified: 3/1/2019 <br>
*
<hr>
* 
* 
*
* <hr>
*	@param1 double fica; the amount of social security withheld
*	@param2 double tax; the employees income tax owed
*	@param3 double insurance; insurance payment
*	@return ddeductions; returns employees deductions from pay 
*/
	public static double deductions(double fica, double tax, double insurance)
	{
		double ddeductions = 0;
		ddeductions = (fica + tax + insurance);
		return ddeductions;
	}//end deductions(double, double, double)
	
	
//+netPay(gross:double,deductions):double
/**
* Method Name: netPay <br>
* Method Purpose: To calculate the net pay of employee <br>
* 
* <hr>
* Date created: 2/28/2019 <br>
* Date last modified: 3/1/2019 <br>
*
<hr>
* net pay is determined by gross pay and deductions
* 
*
* <hr>
*	@param1 double gross; employees gross pay for pay period
*	@param2 double deductions; employees deductions from pay
*	@return dnetPay; the actual amount employee is paid
*/
	public static double netPay(double gross, double deductions)
	{
		double dnetPay = 0;
		dnetPay = (gross - deductions);
		return dnetPay;
	}//end dnetPay(double, double)
	
}//end Finance