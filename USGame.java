/*
 * ---------------------------------------------------------------------------
 * File name: USGame
 * Project name: USTrivia
 * ---------------------------------------------------------------------------
 * Creator's name and email: Hiren Patel, patelhm@etsu.edu
 * Course: CSCI-1250-090
 * Creation Date: 7/30/19
 * ---------------------------------------------------------------------------
 */

/*
 * Class Name: USGame.java <br>
 * Class Purpose: This class starts the game, assesses players' answers, and assigns points. <br>
 *
 * <hr>
 * Date created: 7/30/19 <br>
 * Date Last Modified: 7/30/19
 * @author Adam Wells
 */
public class USGame
{
    private UserInput reader;
    private Scoring p1;
    private Scoring p2;
    private Question question;
    private Trivia trivia;
    private int win = 0;    //Win condition flag

    /*
     * Method Name: USGame <br>
     * Method Purpose: No args constructor news up the classes <br>
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
    public USGame()
    {
        reader= new UserInput();
        p1=new Scoring();
        p2=new Scoring();
        question=new Question();
        trivia=new Trivia();
    }

    /*
     * Method Name: start <br>
     * Method Purpose: Starts the game.  Players play to 11 and must win the game by 3 points. <br>
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
     *	@return
     */
    public void start()
    {
        trivia.printWelcome();
        trivia.setPlayer1();
        trivia.setPlayer2();
        question.shuffleQuestionsList();

        for (int i = 0; i < question.getQuestionList().length; i++)
        {
            while(((p1.totalScore() < 11) || (p1.totalScore() < (3+p2.totalScore()))) && ((p2.totalScore() < 11) || (p2.totalScore() < (3+p1.totalScore()))))
            {
                if (i % 2 == 0)
                    {
                    System.out.println(trivia.getPlayer1()+": "  + question.getQuestion(i));
                    correctOrIncorrect(p1,i);
                    }
                else
                    {
                    System.out.println(trivia.getPlayer2()+": " + question.getQuestion(i));
                    correctOrIncorrect(p2,i);
                    }
                i++;
            }
        }
        printGoodbye();
    }

    /*
     * Method Name: correctOrIncorrect <br>
     * Method Purpose: Adds points to an arraylist and displays whether a player's answer is correct or incorrect.
     * It also displays a player's total points. <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 8/1/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param1 Scoring score - calls the scoring method for the players score
     *  @param2 int i - adds to the score
     *	@return
     */
    public void correctOrIncorrect(Scoring score, int i)
    {
        if (question.getAnswer(i).equals(reader.getInput()))
        {
            score.addPoints(2);
            System.out.println("Correct! +2");
            System.out.println("\nTotal Score: " + score.totalScore()+"\n\n");
        }
        else
        {
            score.addPoints(-1);
            String defaultResponse = question.getDefaultResponse();
            System.out.println("Incorrect! -1." + defaultResponse);
            System.out.println("\n" + "The correct answer is: " + question.getAnswer(i));
            System.out.println("\nTotal Score: " + score.totalScore()+"\n\n");
        }
    }

    /*
     * Method Name: printGoodbye <br>
     * Method Purpose: Prints a goodbye statement after the game ends <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 8/1/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param
     *	@return
     */
    public void printGoodbye()
    {
        if (p1.totalScore() > p2.totalScore())
            {
            win = 1;
            }
        else
            {
            win = 2;
            }

        switch (win)
        {
            case 1:
                System.out.println("Congratulations " + trivia.getPlayer1() + " you have WON!");
                break;
            case 2:
                System.out.println("Congratulations " + trivia.getPlayer2() + " you have WON!");
                break;
            default:
                win = 0;
        }
    }
}
