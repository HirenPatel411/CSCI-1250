//Name: Hiren Patel
//Class: CSCI 1250-002
//Lab: Project 1
//Date: 2/13/19
//Purpose: Program that will give the final grades of a course
import java.util.Scanner;
import java.text.DecimalFormat;

public class Proj1
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);		   //Scanner for keyboard input
		DecimalFormat df = new DecimalFormat("##.#");  //Formatter for decimal formatting
		String strName;			//Variable for Name
		String strStudent;		//Variable for Student name
		String strCourse;		//Variable for Course name
		int iQuizAvg;			//Variable for Quiz average
		int iQuizWeight;		//Variable for Quiz percent weight
		int iProjectAvg;		//Variable for Project average
		int iProjectWeight;		//Variable for Project percent weight
		int iExamAvg;			//Variable for Exam average
		int iExamWeight;		//Variable for Exam percent weight
		int iFinalAvg;			//Variable for Final average
		int iFinalWeight;		//Variable for Final percent weight
		int iMax1;				//Variable for the maximum of quiz and project
		int iMax2;				//Variable for the maximum of exams and final
		int iMax3;				//Variable for the maximum of all
		int iMin1;				//Variable for the minimum of quiz and project
		int iMin2;				//Variable for the minimum of exams and final
		int iMin3;				//Variable for the minimum of all
		double dCourseAvgN;		//Variable for numerator course average 
		double dCourseAvgD;		//Variable for denominator course average 
		double dCourseAvg;		//Variable for course average 
		
		Utility.myInfo("Hiren Patel", "CSCI 1250-002", "Project 1", "2/13/19");
		
		System.out.print("\n\n\tEnter the user's name: ");
		strName = kb.nextLine(); Utility.welcomeMsg(strName);
		
		System.out.print("\n\n\tStudent name: ");
		strStudent = kb.nextLine();
		System.out.print("\tCourse: ");
		strCourse = kb.nextLine();
		
		System.out.print("\n\tQuiz Average and percent weight (separated by a space): ");
		iQuizAvg = kb.nextInt();
		iQuizWeight = kb.nextInt();
		System.out.print("\n\tProject Average and percent weight "
							+ "(separated by a space) : ");
		iProjectAvg = kb.nextInt();
		iProjectWeight = kb.nextInt();
		System.out.print("\n\tExam Average and percent weight (separated by a space): ");
		iExamAvg = kb.nextInt();
		iExamWeight = kb.nextInt();
		System.out.print("\n\tFinal Exam and percent weight (separated by a space): ");
		iFinalAvg = kb.nextInt();
		iFinalWeight = kb.nextInt();
		
		dCourseAvgN = (iQuizAvg * iQuizWeight) + (iProjectAvg * iProjectWeight) + 
				(iExamAvg * iExamWeight) + (iFinalAvg * iFinalWeight);
		dCourseAvgD = (iQuizWeight + iProjectWeight + iExamWeight + iFinalWeight);
		
		dCourseAvg = (dCourseAvgN/dCourseAvgD);
		
		System.out.print("\n\tFinal Grade in " + strCourse + " for " + strStudent + 
						" is " + df.format(dCourseAvg));
		
		iMax1 = Math.max(iQuizAvg,iProjectAvg);
		iMax2 = Math.max(iExamAvg,iFinalAvg);
		iMax3 = Math.max(iMax1,iMax2);				
		System.out.print("\n\n\tThe largest average was " + iMax3);
		
		iMin1 = Math.min(iQuizAvg,iProjectAvg);
		iMin2 = Math.min(iExamAvg,iFinalAvg);
		iMin3 = Math.min(iMin1,iMin2);				
		System.out.print("\n\tThe smallest average was " + iMin3);
		System.out.print("\n\n");
		
		Utility.endingMsg(strName);
		Utility.pause();
		
	}//End main(String[])

}//End Proj1