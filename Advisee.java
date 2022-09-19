public class Advisee
{
	private String name;				// Students name
	private String studentID;			// Students identification
	private String concentration;		// Students concentration
	private int completedHours;			// Hours completed by student
	private int attemptedHours;			// Hours attempted by student
	private int qualityPoints;			// Quality points earned by student
	private String advisor;				// Advisors name
	private boolean majorSheet;			// Students major
	private boolean intentToGraduate;	// Students intent to graduate
	public double gpa;					// Students GPA
/**
* Method Name: Advisee <br>
* Method Purpose: A contractor for Advisee <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019
* <hr>
*	na 
*	na
* <hr>
*	@param NONE
*
*/
	public Advisee()
	{
		this.name = " ";
		this.studentID = " ";
		this.concentration  = " ";
		this.completedHours = 0;
		this.attemptedHours = 0;
		this.qualityPoints = 0;
		this.gpa = 0.000;
		this.advisor = " ";
		this.majorSheet = false;
		this.intentToGraduate = false;
	}//end Advisee()

/**
* Method Name: Advisee <br>
* Method Purpose: A switch for Advisee <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019
*
* <hr> 
*	
*	@param num: int - disparate the 3 student advisee
*	@return NONE
*/
	public Advisee(int num)
	{
		
		switch(num)
		{
			case 1:
				this.name = "Jane Doe";
				this.studentID = "E00012345";
				this.completedHours = 125;
				this.attemptedHours = 125;
				this.qualityPoints = 375;
				this.gpa = 3.000;
				this.concentration ="IS";
				this.majorSheet = true;
				this.advisor = "Bailey";
				this.intentToGraduate = true;
				break;
			case 2:
				this.name = "John Smith";
				this.studentID = "E000678912";
				this.completedHours = 90;
				this.attemptedHours = 90;
				this.qualityPoints = 287;
				this.gpa = 3.189;
				this.advisor = "Erdine";
				this.concentration ="CS";
				this.majorSheet = false;
				this.intentToGraduate = false;
				break;
			case 3:
				this.name = "Andy Wilson";
				this.studentID = "E00090234";
				this.concentration ="IT";
				this.advisor = "Dean";
				this.completedHours = 50;
				this.attemptedHours = 50;
				this.qualityPoints = 188;
				this.gpa = 3.760;
				this.majorSheet = true;
				this.intentToGraduate = false;
				break;
			default:
				
		}//end switch
	}//end Advisee(int)
	
/** Method Name: Advisee <br>
* Method Purpose: returning the current class instance  <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  name:String - name of student
*   @param  studentID:String - students id
*   @param  concentration:String - students concentration
*   @param  completedHours:int - amount of hours student completed
*   @param  attemptedHours:int - amount of hours student attempted
*   @param  qualityPoints:int - amount of student quality points
*   @param  advisor:String - students advisor name
*   @param  majorSheet:boolean - students major
*   @param  intentToGraduate:boolean - students intent to graduate
*   @return NONE
*/		
	public Advisee(String name, String studentID, String concentration, 
	int completedHours, int attemptedHours, int qualityPoints, String advisor, 
	boolean majorSheet, boolean intentToGraduate)
	{
		this.name = name;
		this.studentID = studentID;
		this.concentration = concentration;
		this.completedHours = completedHours;
		this.attemptedHours = attemptedHours;
		this.qualityPoints = qualityPoints;
		this.advisor = advisor;
		this.majorSheet = majorSheet;
		this.intentToGraduate = intentToGraduate;
	}//end Advisee(String,String,String,String,int,int,String,boolean,boolean)
		
/** Method Name: Advisee <br>
* Method Purpose: Copy construtor <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  a:Advisee - the new value of the Advisee
*   @return NONE
*/	
	public Advisee(Advisee a)
	{
		this.name = a.name;
		this.studentID = a.studentID;
		this.concentration = a.concentration;
		this.completedHours = a.completedHours;
		this.attemptedHours = a.attemptedHours;
		this.qualityPoints = a.qualityPoints;
		this.advisor = a.advisor;
		this.majorSheet = a.majorSheet;
		this.intentToGraduate = a.intentToGraduate;
	}//end Advisee(Advisee)
	
/** Method Name: setName <br>
* Method Purpose: Assigns a new value to the Name <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  name:String  - the new value of the name
*   @return NONE
*/	
	public void setName(String name)
	{
		if(!name.equals(""))
		{
			this.name = name;
		}//end if
	}//end setName(String)

/** Method Name: setID <br>
* Method Purpose: Assigns a new value to the student ID <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  ID:String  - the new value of the student ID
*   @return NONE
*/
	public void setID(String ID)
	{
		if(!studentID.equals(""))
		{
			this.studentID = studentID;
		}//end if
	}//end setID(String)
	
/** Method Name: setConcentration <br>
* Method Purpose: Assigns a new value to the concentration <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  Concentration:String  - the new value of the concentration
*   @return NONE
*/
	public void setConcentration(String concentration)
	{
		if(!concentration.equals(""))
		{
			this.concentration = concentration;
		}//end if
	}//end setConcentration(String)
	
/** Method Name: setCompletedHours <br>
* Method Purpose: Assigns a new value to the Completed Hours <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  hours:int  - the new value of the Completed Hours
*   @return NONE
*/
	public void setCompletedHours(int hours)
	{
		if(completedHours != 0)
		{
			this.completedHours = completedHours;
		}//end if
	}//end setCompletedHours(int)
	
/** Method Name: setAdvisor <br>
* Method Purpose: Assigns a new value to the advisor <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  advisor:String  - the new value of the advisor
*   @return NONE
*/
	public void setAdvisor(String advisor)
	{
		if(!advisor.equals(""))
		{
			this.advisor = advisor;
		}//end if
	}//end setAdvisor(String)
	
/** Method Name: setQualityPoints <br>
* Method Purpose: Assigns a new value to the Quality Points <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  points:int  - the new value of the Quality Points
*   @return NONE
*/
	public void setQualityPoints(int points)
	{
		if(qualityPoints != 0)
		{
			this.qualityPoints = qualityPoints;
		}//end if
	}//end setQualityPoints(int)
	
/** Method Name: setAttemptedHours <br>
* Method Purpose: Assigns a new value to the Attempted Hours <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  hours:int  - the new value of the Attempted Hours
*   @return NONE
*/
	public void setAttemptedHours(int hours)
	{
		if(attemptedHours != 0)
		{
			this.attemptedHours = attemptedHours;
		}//end if
	}//end setAttemptedHours(int)
	
/** Method Name: setMajorSheet <br>
* Method Purpose: Assigns a new value to the Major Sheet <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  major:boolean  - the new value of the Major Sheet 
*   @return NONE
*/		
	public void setMajorSheet(boolean major)
	{
		if(!majorSheet == false)
		{
			this.majorSheet = majorSheet;
		}//end if
	}//end setMajorSheet(boolean)
	
/** Method Name: setIntent <br>
* Method Purpose: Assigns a new value to intent <br>
*
* <hr>
* Date created: 3/30/19 <br>
* Date last modified: 3/30//2019 <br>
*
* <hr>
* 
* 
* <hr>
*   @param  intent:boolean  - the new value of the intent
*   @return NONE
*/
	public void setIntent(boolean intent)
	{
		if(!intentToGraduate == false)
		{
			this.intentToGraduate = intentToGraduate;
		}//end if
	}//end setIntent(boolean)
	
	
/** Method Name: getName <br>
* Method Purpose: this method gets the name and returns
* as a String <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*  
*	@return a String containing the name 
*/
	public String getName()
	{
		return this.name;
	}//end getName
	
/** Method Name: getID <br>
* Method Purpose: this method gets the ID returns
* as a String <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
* 
*
* <hr>
*   
*	@return a String containing the student ID
*/	
	public String getID()
	{
		return this.studentID;
	}//end getID
	
/** Method Name: getConcentration <br>
* Method Purpose: this method gets the concentration and returns
* as a String <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
* 
* <hr>
*  
*	@return a String containing the concentration
*/
	public String getConcentration()
	{
		return this.concentration;
	}//end getConcentration

/** Method Name: getHours <br>
* Method Purpose: this method gets the hours and returns
* as a int <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*
*	@return a int containing the hours
*/
	public int getHours()
	{
		return this.completedHours;
	}//end getHours
	
/** Method Name: getAdvisor <br>
* Method Purpose: this method gets the advisor and returns
* as a String <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*
*	@return a String containing the advisor
*/
	public String getAdvisor()
	{
		return this.advisor;
	}//end getAdvisor
	
/** Method Name: getQualityPoints <br>
* Method Purpose: this method gets the quality points and returns
* as a int <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*
*	@return a int containing the quality points
*/
	public int getQualityPoints()
	{
		return this.qualityPoints;
	}//end getQualityPoints
	
/** Method Name: getAttemptedHours <br>
* Method Purpose: gets the attempted hours and returns
* as a int
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*	@return a int containing the attempted hours
*/
	public int getAttemptedHours()
	{
		return this.attemptedHours;
	}//end getAttemptedHours
	
/** Method Name: doneMajorSheet <br>
* Method Purpose: this method completes the major sheet
* as a boolean <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*	@return a boolean containing the major
*/
	public boolean doneMajorSheet()
	{
		boolean doneMajorSheet = false;
		if(majorSheet == false)
		{
			doneMajorSheet = false;
		}
		else 
			doneMajorSheet = true;
		return doneMajorSheet;
	}//end doneMajorSheet
	
/** Method Name: doneIntent <br>
* Method Purpose: this method completes the intent
* as a boolean <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*	@return a boolean containing the intent to graduate
*/
	public boolean doneIntent()
	{
		boolean doneIntent = false;
		if(intentToGraduate == false)
		{
			doneIntent = false;
		}
		else 
			doneIntent = true;
		return doneIntent;
	}//end doneIntent
	
/** Method Name: gpa <br>
* Method Purpose: this method calculates the GPA
* as a double <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*	@return a double containing the gpa
*/
	public double gpa()
	{
		double gpa;
		gpa = (double) this.qualityPoints/this.attemptedHours;
		return gpa;
	}
	
/** Method Name: classification  <br>
* Method Purpose: this method is what the student is classified as String <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*	@return a String containing the classification
*/
	public String classification()
	{
		String classif="";
		if(completedHours < 30)
			classif = "Freshman";
		else if(completedHours <60)
			classif = "Sophomore";
		else if(completedHours <90)
			classif = "Junior";
		else
			classif = "Senior";
		return classif;
	}//end classification()
	
/** Method Name: metGradRequirements <br>
* Method Purpose: this method contains the requirements to graduate
* as a boolean <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*	@return a boolean containing the requirement
*/
	public boolean metGradRequirements()
	{
		boolean blnResult = false;
		if(completedHours>=120 && majorSheet && intentToGraduate)
			blnResult = true;
		return blnResult;
	}//end metGradRequirements
	
/** Method Name: clearedToGraduate <br>
* Method Purpose: this method calculates to see if you are cleared to graduate
* as a String <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*  
*	@return a String containing cleared to graduate
*/
	public String clearedToGraduate()
	{
		String strReturn="";
		if (metGradRequirements() )
			strReturn = "-Yes- All Requirements have been met";
		else
		{
			strReturn += "-No - Not all requirements have been met; ";
			if(completedHours<120)
				strReturn += "Not enough hours to graduate: " 
							+ completedHours +"; ";
			if (!majorSheet)
				strReturn +="Did not complete major sheet; ";
			if(!intentToGraduate)
				strReturn +="Did not file an intent to graduate; ";
		}
		return strReturn;
	}//end clearedToGraduate

/** Method Name: equals <br>
* Method Purpose: this method tests if it is equal
* as a boolean <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*	@param a: Advisee - student a advisee
*	@return a boolean containing address
*/
	public boolean equals(Advisee a)
	{
		boolean equals = true;
		if(!a.getName().equals(this.name))
		{
			equals = false;
		}
		else if(!a.getID().equals(this.studentID))
		{
			equals = false;
		}
		else if(!a.getConcentration().equals(this.concentration))
		{
			equals = false;
		}
		else if(a.getHours() != this.completedHours)
		{
			equals = false;
		}
		else if(a.getAttemptedHours() != this.attemptedHours)
		{
			equals = false;
		}
		else if(a.getQualityPoints() != this.qualityPoints)
		{
			equals = false;
		}
		else if(!a.getAdvisor().equals(this.advisor))
		{
			equals = false;
		}
		else if(a.doneMajorSheet() != this.majorSheet)
		{
			equals = false;
		}
		else if(a.doneIntent() != this.intentToGraduate)
		{
			equals = false;
		}//end if
		return equals;
	}//end equal()
		
/** Method Name: equivalent <br>
* Method Purpose: subset of equals
* as a boolean <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*	@param a: Advisee - student a advisee
*	@return a boolean containing address
*/
	public boolean equivalent(Advisee a)
	{
		boolean equivalent = true;
		if(a.getHours() != this.completedHours)
		{
			equivalent = false;
		}
		else if(a.getAttemptedHours() != this.attemptedHours)
		{
			equivalent = false;
		}
		else if(a.getQualityPoints() != this.qualityPoints)
		{
			equivalent = false;
		}
		else if(!a.getConcentration().equals(this.concentration))
		{
			equivalent = false;
		}//end if
		return equivalent;
	}//end equivalent()
			
/** Method Name: adviseeReport <br>
* Method Purpose: this method displays the report
* as a String <br>
*
* <hr>
* Date created: 3/30/2019 <br>
* Date last modified: 3/30/2019 <br>
*
* <hr>
*
* <hr>
*
*	@return a String containing all pertinent information about advisee
*/
	public String adviseeReport()
	{
		
		String strMsg ="";
		String strReport="";
		strReport += "\n\nAdvisee Report";
		strReport += "\n-------------------------";
		strReport += " \nName:  " + this.name;
		strReport += " \nID:  " + this.studentID;
		strReport += " \nAdvisor:  " + this.advisor;
		strReport += " \n\nConcentration:  " + this.concentration;
		strReport += " \nCompleted Hours:  " + this.completedHours;
		strReport += " \nAttempted Hours:  " + this.attemptedHours;
		strReport += " \nQuality Points:  " + this.qualityPoints;
		strReport += " \nGPA:  " + this.gpa;
		strMsg = clearedToGraduate();
		strReport += " \nCleared for Graduation: " + strMsg;
		strReport += " \nIntent to Graduate Done: ";
		if(intentToGraduate == true)
		{
			strReport += "Yes";
		}
		else
		{
			strReport += "No";
		}
		strReport += " \nClassification: " + this.classification();
		strReport+="\n\n";
		return strReport;
	}
}//end Advisee	
		
			
			
