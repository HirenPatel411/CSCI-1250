//Name:		Dr. Gene Bailey
//Class:	CSCI 1250-003
//Lab:		Project 4 - extension file
//Date:		4-8-2016
//Purpose:	Extension file of Project 4 for use of methods within class

import java.util.Scanner;

public class Utility
{	
	/**
	 * Method Name: welcomeMsg <br>
	 * Method Purpose: displays welcome message <br>
	 *
	 * <hr>
	 * Date created: 3/17/2016 <br>
	 *
	 * <hr>
	 * Display welcoming message to the screen.
	 *  
	 *
	 * <hr>
	 *
	 * 
	*/
	
	public static void welcomeMsg(String strName)
	{
		
		System.out.print("\n\tGood day, " + strName + ". Welcome to my progam!");
		
	}//end welcomeMessage(String)
	
	/**
	 * Method Name: welcomeMessage <br>
	 * Method Purpose: displays ending message <br>
	 *
	 * <hr>
	 * Date created: 3/17/2016 <br>
	 *
	 * <hr>
	 * Display ending message to the screen.
	 *  
	 *
	 * <hr>
	 *
	 * 
	*/
	
	public static void endingMsg(String strName)
	{
		
		System.out.print("\n\tThanks for using my program, " + strName + ".");
		
	}//end endingMessage(String)
	
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
	
	/**
	 * Method Name: clearScreen <br>
	 * Method Purpose: to 'clear' the screen by printing multiple lines <br>
	 *
	 * <hr>
	 * Date created: 3/17/2016 <br>
	 *
	 * <hr>
	 * Print 56 lines.
	 *  
	 *
	 * <hr>
	 *
	 *
	*/
	public static void clearScreen()
	{
		
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	}//end clearScreen()
	
	/**
	 * Method Name: pause <br>
	 * Method Purpose: to pause the program <br>
	 *
	 * <hr>
	 * Date created: 3/17/2016 <br>
	 *
	 * <hr>
	 * Pause screen until user hits the enter key.
	 *  
	 *
	 * <hr>
	 *
	 *
	*/
	public static void pause()
	{
		Scanner kb = new Scanner(System.in);	//used to get user-input from the
												//keyboard
		//kb.nextLine();
		System.out.print("\n\n\t  ***** Press enter to continue *****\n\n");
		kb.nextLine();
		
	}//end pause()
	
}//end 