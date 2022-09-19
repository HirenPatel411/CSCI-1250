import java.util.Scanner;
public class Proj3
/**
*    Student: Hiren Patel <br>
* Class Name: Proj3 <br>
* Class Purpose: Display students Advisees record  <br>
*
* <hr>
* Date created: 3/25/2019 <br>
* Date last modified: 4/1/2019
* @author Hiren Patel
*/
{
	public static void main(String[] args)
	{
		int i;			 //Loop variable
		Advisee student; //new advisee variable
		String strInfo;  //Varibale for students info
		
		myInfo("Hiren Patel", "CSCI 1250-002", "Proj3", "4/1/19");
		System.out.println();
		
		for(i = 1; i <= 3; i++)
		{
			student = new Advisee(i); 
			strInfo = student.adviseeReport();
			System.out.println(strInfo);
		}
				
	}//end main String[]
		
/**
 * Method Name: myInfo <br>
 * Method Purpose: to display the header info for this program <br>
 *
 * <hr>
 * Date created: 3/30/2018 <br>
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
			
}//end Proj3
