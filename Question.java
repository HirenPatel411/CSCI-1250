/*
 * ---------------------------------------------------------------------------
 * File name: Question
 * Project name: USTrivia
 * ---------------------------------------------------------------------------
 * Creator's name and email: Hiren Patel, patelhm@etsu.edu
 * Course: CSCI-1250-090
 * Creation Date: 7/30/19
 * ---------------------------------------------------------------------------
 */

import java.util.ArrayList;     //import statement for ArrayList
import java.util.Hashtable;     //import statement for Hashtable
import java.util.Random;        //import statement for Random

/*
 * Class Name: Question.java <br>
 * Class Purpose: This class establishes a hashtable containing 50 questions and answers.
 * It copies the questions into a string array and shuffles that array.  It also returns answers. <br>
 *
 * <hr>
 * Date created: 7/30/19 <br>
 * Date Last Modified: 7/30/19
 * @author Hiren Patel
 */

public class Question
{
    private Random rand;    //Random field to randomize questions
    private ArrayList<String> defaultResponses;     //ArrayList<String> field for default responses
    private Hashtable<String, String> questionMap;  //Hashtable<String, String> field for the list of questions
    private String[] questionList;      //Array of String[] for the questionList

    /*
     * Method Name: Question <br>
     * Method Purpose: No args constructor <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/28/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param
     *	@return
     */
    public Question()
    {
        rand = new Random();
        defaultResponses = new ArrayList<>();
        questionMap = new Hashtable<>(50);
        questionList=new String[50];
        fillQuestionMap();
        fillDefaultResponses();
        fillQuestionList();
    }

    /*
     * Method Name: fillQuestionMap <br>
     * Method Purpose: This method fills a Hashtable (questionMap) with questions as keys and answers as values. <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/30/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param
     *	@return
     */
    private void fillQuestionMap()
    {
        questionMap.put("What state has the largest land mass?", "Alaska");
        questionMap.put("What state has the largest population?", "California");
        questionMap.put("How many amendments does the Constitution have?", "27");
        questionMap.put("Who is the first African American to play in Major League Baseball? (First name Last name)", "Jackie Robinson");
        questionMap.put("A U.S. Senator is elected for how many years?", "6");
        questionMap.put("Dr. Seuss created the first animated TV ad for what American car company?", "Ford");
        questionMap.put("How many voting members are in the U.S. House of Representatives?", "435");
        questionMap.put("When was the U.S. Constitution written?","1787");
        questionMap.put("What are the first ten amendments to the Constitution called?", "Bill of Rights");
        questionMap.put("How many U.S. Senators are there?", "100");
        questionMap.put("In what month do we vote for President?", "November");
        questionMap.put("If both the President and Vice President can no longer serve, who becomes President?", "Speaker of the House");
        questionMap.put("How many justices are on the U.S. Supreme Court", "9");
        questionMap.put("What is the capital of Virginia?","Richmond");
        questionMap.put("What is the capital of Tennessee?", "Nashville");
        questionMap.put("What is the capital of North Carolina?", "Raleigh");
        questionMap.put("The Statue of Liberty was a gift from which country?", "France");
        questionMap.put("How many states border Tennessee?", "8" );
        questionMap.put("Which state is known as the Lone Star State?", "Texas");
        questionMap.put("Which state is known as the Golden State?", "California");
        questionMap.put("Which state is known as the Empire State", "New York");
        questionMap.put("What is the capital of New York?","Albany");
        questionMap.put("What is the capital of California?","Sacramento");
        questionMap.put("What is the capital of Maryland?","Annapolis");
        questionMap.put("Who was the 16th President of the United States? (First name Last name)", "Abraham Lincoln");
        questionMap.put("Who was the 2nd President of the United States? (First name Last name)", "John Adams");
        questionMap.put("What is the United states national bird? (Be specific)", "Bald Eagle");
        questionMap.put("What is the United states national mammal?", "Bison");
        questionMap.put("What state is bordered by Nebraska, Kansas, Oklahoma, New Mexico, Utah, and Wyoming?", "Colorado");
        questionMap.put("What state has the smallest land mass?", "Rhode Island");
        questionMap.put("What is the capital of Florida? (Good luck spelling it!)", "Tallahassee");
        questionMap.put("Which state is known as the Land of 10,000 Lakes?", "Minnesota");
        questionMap.put("What is the capital of Arizona?", "Phoenix");
        questionMap.put("What is the capital of Georgia?","Atlanta");
        questionMap.put("Which state is known as the Sunshine State?", "Florida");
        questionMap.put("Which state is known as the Tar Heel State?", "North Carolina");
        questionMap.put("What does 'NASA' stand for?","National Aeronautics and Space Administration.");
        questionMap.put("Which state is known as the Pelican State?", "Louisiana");
        questionMap.put("Which state is known as the Volunteer State", "Tennessee");
        questionMap.put("Who was the 3rd President of the United States?", "Thomas Jefferson");
        questionMap.put("What sport is known as Americas Past Time?" , "Baseball");
        questionMap.put("What is the capital of Wisconsin?", "Madison");
        questionMap.put("In what year was the Declaration of Independence written?","1776");
        questionMap.put("What state has the smallest population", "Wyoming");
        questionMap.put("Who was the tallest President of the United States? (First name Last name)", "Abraham Lincoln");
        questionMap.put("Who was the first African-American President of the U.S.? (First name Last name)", "Barack Obama");
        questionMap.put("What type of tree is the United States national tree? (One word)","Oak");
        questionMap.put("What is the capital of Texas","Austin");
        questionMap.put("What is Tennessee's state bird?","Mockingbird");
        questionMap.put("What city has the highest crime rate in the US?","Detroit");
        questionMap.put("Who was the 1st President of the United States? (First name Last name)","George Washington");
        questionMap.put("Who was President on September 11, 2001? (First name Middle initial Last name)","George W. Bush");

    }

    /*
     * Method Name: fillDefaultResponses <br>
     * Method Purpose: This method uses an ArrayList and fills defaultResponses. <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/30/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param
     *	@return
     */
    private void fillDefaultResponses()
    {
        defaultResponses.add("\n\nWow. Maybe go to the US History section in Sherrod?");
        defaultResponses.add("\n\nI bet you have a great personality though!");
        defaultResponses.add("\n\nI hope you're better at Computer Science.");
        defaultResponses.add("\n\nDon't worry. A children's version of this game will be coming soon.");
        defaultResponses.add("\n\nCome on! That was an easy question!");
        defaultResponses.add("\n\nThat's just Sad!");
        defaultResponses.add("\n\nYou're not even trying!");
        defaultResponses.add("\n\nI'm sure your mom still thinks you are smart.");
        defaultResponses.add("\n\nYou probably have other strengths.");
        defaultResponses.add("\n\nIt's okay honey. Maybe next time.");
        defaultResponses.add("\n\nYou suck.");
        defaultResponses.add("\n\nYou might lose now!");
        defaultResponses.add("\n\nAww that must've hurt!");
        defaultResponses.add("\n\nWhy are you so bad at this?");


    }

    /*
     * Method Name: fillQuestionMap <br>
     * Method Purpose: This method illustrates a for-each loop.  It is not used elsewhere. <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/30/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param
     *	@return
     */
    public void printDefaultResponses()
    {
        for(String s : defaultResponses)
        {
           System.out.println(s+"\n");
        }
    }

    /*
     * Method Name: fillQuestionList <br>
     * Method Purpose: This method fills a string array with questions contained in questionMap. <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/30/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param
     *	@return
     */
    public void fillQuestionList()
    {
        this.questionList= questionMap.keySet().toArray(new String[questionMap.size()]);
    }

    /*
     * Method Name: getAnswer <br>
     * Method Purpose: Gets the answer contained in the appropriate value of the questionMap (hashtable). <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/30/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param int i - index
     *	@return String - hashtable value
     */

    public String getAnswer (int i)
    {
        String q= questionMap.get(questionList[i]);
        return q.toString().trim().toLowerCase();
    }

    /*
     * Method Name: getDefaultResponse <br>
     * Method Purpose: This method generates a random response from the list of defaultResponses. <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/30/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param
     *	@return String - Returns the the appropriate answer.
     */
    public String getDefaultResponse()
    {
        int num=rand.nextInt(defaultResponses.size());
        return defaultResponses.get(num);
    }

    /*
     * Method Name: shuffleQuestionList <br>
     * Method Purpose: This method shuffles the question list.  <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/30/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param
     *	@return
     */
    public void shuffleQuestionsList()
    {
        for (int i=0; i < questionList.length; i++)
        {
            int num = rand.nextInt(questionList.length);
            String q = questionList[i];
            questionList[i] = questionList[num];
            questionList[num] = q;
        }
    }

    /*
     * Method Name: getQuestion <br>
     * Method Purpose: This method gets one question from the list of questions. <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/30/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param int i - index
     *	@return String - returns question
     */
    public String getQuestion(int i)
    {
        if (i < questionList.length)
        {
            return questionList[i];
        }
        else
        {
            return ("You killed the pool of questions. Restart the game!");
        }
    }

    /*
     * Method Name: getQuestionList <br>
     * Method Purpose: This method gets the list of questions in the questionList array <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 8/2/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param
     *	@return String array - returns questions
     */
    public String[] getQuestionList()
    {
        return questionList;
    }
}


