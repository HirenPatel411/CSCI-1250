//Name:		Hiren Patel 
//Class:	CSCI 1250-002
//Lab:		Project 2
//Date:		3-7-2019
//Purpose:	Display Finance of employee using methods
import java.util.Scanner;
import java.text.DecimalFormat;

public class Proj2
{
	public static void main(String[] args)
	{
		String strEname;		//Users employee name
		String strTemp;			//Temp variable for family insurance
		char cGender;			//Users Gender
		int iDependents;		//The users dependents
		double dHours;			//Hours user has worked
		double dRate;			//Users rate of pay
		boolean blnFamily;		//If user has family insurance
		int iAge;				//Users Age
		double dGross;			//Variable for gross pay method
		double dFica;			//Variable for FICA method
		double dIncomeTax;		//Variable for income tax method
		double dInsurance;		//Variable for insurance method
		double dDeductions;		//Variable for deductions method
		double dNetPay;			//Variable for net pay method
		
		Scanner kbAlpha = new Scanner(System.in);	//Scanner for keyboard alphabet input
		Scanner kbNum = new Scanner(System.in);		//Scanner for keyboard number input
		DecimalFormat df = new DecimalFormat("$#,###.00");	//Format for decimal placement
		
		myInfo("Hiren Patel", "CSCI 1250-002", "Project 2", "3/1/19");
		System.out.print("\n\nEnter employee's name (First Last): ");
		strEname=kbAlpha.nextLine();
		System.out.print("\nGender (M / F): ");
		cGender=kbAlpha.nextLine().charAt(0);
		System.out.print("\nEnter number of dependents: ");
		iDependents=kbNum.nextInt();
		System.out.print("\nEnter number of hours the employee worked: ");
		dHours=kbNum.nextDouble();
		System.out.print("\nEnter the employee's payrate: ");
		dRate=kbNum.nextDouble();
		System.out.print("\nDoes the employee have family insurance (Y / N): ");
		strTemp = kbAlpha.nextLine();
		if(strTemp.equals("Y") || strTemp.equals("y"))
		{
			blnFamily=true;
		}
		else
		{
			blnFamily=false;
		}
		System.out.print("\nEnter employee's age: ");
		iAge=kbNum.nextInt();
		
		dGross = Finance.grossPay(dHours, dRate);
		dFica = Finance.fica(dGross);
		dIncomeTax = Finance.incomeTax(dGross, iDependents);
		dInsurance = Finance.insurance(cGender, iAge, blnFamily);
		dDeductions = Finance.deductions(dFica, dIncomeTax, dInsurance);
		dNetPay = Finance.netPay(dGross, dDeductions);
		
		System.out.print("\nGross Pay: " + df.format(dGross));
		System.out.print("\nInsurance: " + df.format(dInsurance));
		System.out.print("\nIncome Tax: " + df.format(dIncomeTax));
		System.out.print("\nFICA: " + df.format(dFica));
		System.out.print("\nDeductions: " + df.format(dDeductions));
		System.out.print("\nNet Pay: " + df.format(dNetPay));
		System.out.println("\n");
		
	}//end main (String[])
/**
 * Method Name: myInfo <br>
 * Method Purpose: to display the header info for this program <br>
 *
 * <hr>
 * Date created: 3/17/2016 <br>
 *
 * <hr>
 * Displays name, class, lab, and date info for this program after receiving the 
 *  lab and date from main when called. Name and class are hard-coded.
 *
 * <hr>
 *
 *
*/
public static void myInfo(String strName, String strCourse, String strLab, String strDate)
	{
		
		System.out.print("\n\n\t Name:	"+strName);
		System.out.print("\n\tClass:	"+strCourse);
		System.out.print("\n\t  Lab:	" + strLab);
		System.out.print("\n\t Date:	" + strDate);
		
	}//end myInfo(String, String,String,String)
}//end Proj2