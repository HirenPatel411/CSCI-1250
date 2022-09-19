import java.util.Scanner;
public class Proj4
/**
*    Student: Hiren Patel <br>
* Class Name: Proj4 <br>
* Class Purpose: Display boxes information  <br>
*
* <hr>
* Date created: 4/14/2019 <br>
* Date last modified: 4/15/2019
* @author Hiren Patel
*/
{
	public static void main(String[] args)
	{
		myInfo("Hiren Patel", "CSCI 1250-002", "Proj4", "4/15/19");
		System.out.println();
		System.out.println();
		int i;
		String strInfo;			//Variable for boxes info
		Box b1;					//first box variable
		Box b2;					//second box variable
		Box b3;					//third box variable
		Box b4;
			System.out.print("Testing default information");
			System.out.print("\n-------------------------");
			b1 = new Box();
			strInfo = b1.boxInfo();
			System.out.print("\n\n" + strInfo);	
			
	pause();
			
			System.out.print("\nTesting different dimensions");
			System.out.print("\n-------------------------");
			b2 = new Box();
			b2.setDim(11,14,19);
			strInfo = b2.boxInfo();
			System.out.print("\n\n" + strInfo);	
			
	pause();
	
			System.out.print("\nTesting different color and material");
			System.out.print("\n-------------------------");
			b3 = new Box();
			b3.setColor("rEd");
			b3.setType("meTaL");
			strInfo = b3.boxInfo();
			System.out.print("\n\n" + strInfo);	
			
	pause();
	
			System.out.print("\nTesting all methods at once");
			System.out.print("\n-------------------------");
			b4 = new Box();
			b4.setDim(21,22,23);
			b4.setColor("bLuE");
			b4.setType("wOOd");
			strInfo = b4.boxInfo();
			System.out.print("\n\n" + strInfo);	
			
	pause();
	
			System.out.print("\nTesting equals method");
			System.out.print("\n-------------------------");
			if(b2.equals(b4))
			{
				System.out.print("\nThey are the SAME!!");
			}
			else
			{
				System.out.print("\nThey are the DIFFERENT!");
			}//end if
			System.out.println();
			
	}//end String[]
	
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
	
/**Method Name: pause <br>
	 * Method Purpose: to pause the program <br>
	 *
	 * <hr>
	 * Date created: 3/17/2018 <br>
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
}//end Proj4