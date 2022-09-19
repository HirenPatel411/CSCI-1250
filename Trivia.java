/*
 * ---------------------------------------------------------------------------
 * File name: Trivia
 * Project name: USTrivia
 * ---------------------------------------------------------------------------
 * Creator's name and email: Hiren Patel, patelhm@etsu.edu
 * Course: CSCI-1250-090
 * Creation Date: 7/30/19
 * ---------------------------------------------------------------------------
 */

/*
 * Class Name: Trivia.java <br>
 * Class Purpose: This class gets the users names and prints the welcome statement. <br>
 *
 * <hr>
 * Date created: 7/30/19 <br>
 * Date Last Modified: 7/30/19
 * @author Hiren Patel
 */

public class Trivia
{
    private UserInput input;    //Field for the UsersInput
    private String player1;     //Field for player 1's name
    private String player2;     //Field for player 2's name

    /*
     * Method Name: Trivia <br>
     * Method Purpose: No args constructor  <br>
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
    public Trivia()
    {
        input=new UserInput();
    }

    /*
     * Method Name: setPlayer1 <br>
     * Method Purpose: sets player1's name <br>
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
    public void setPlayer1()
    {
        System.out.println("Enter player1's name: ");
        player1 = input.getInput();
    }

    /*
     * Method Name: setPlayer2 <br>
     * Method Purpose: sets player2's name <br>
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
    public void setPlayer2()
    {
        System.out.println("Enter player2's name: ");
        player2= input.getInput();

    }

    /*
     * Method Name: getPlayer1 <br>
     * Method Purpose: gets player1's name <br>
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
     *	@return String - Returns player 1's name
     */
    public String getPlayer1()
    {
        return player1;
    }

    /*
     * Method Name: getPlayer2 <br>
     * Method Purpose: gets player2's name <br>
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
     *	@return String - Returns player 2's name
     */
    public String getPlayer2()
    {
        return player2;
    }

    /*
     * Method Name: printWelcome <br>
     * Method Purpose: Prints a welcome statement at the beginning of the game <br>
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
    public void printWelcome()
    {
        System.out.println("Welcome to Adam and Hiren's US Trivia game! :)");
        System.out.println();
        System.out.println("You will be asked a series of questions.");
        System.out.println("You must get your question correct to receive 2 points.");
        System.out.println("But if you get the question wrong you will lose 1 point.");
        System.out.println("First player to score 11 points and win by 3 WINS THE GAME!!");
        System.out.println();
        System.out.println("Good Luck.");
        System.out.println();
    }

}