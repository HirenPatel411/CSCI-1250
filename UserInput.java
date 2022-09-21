/*
 * ---------------------------------------------------------------------------
 * File name: UserInput
 * Project name: USTrivia
 * ---------------------------------------------------------------------------
 * Creator's name and email: Hiren Patel, patelhm@etsu.edu
 * Course: CSCI-1250-090
 * Creation Date: 7/30/19
 * ---------------------------------------------------------------------------
 */

import java.util.Scanner;

/*
 * Class Name: UserInput.java <br>
 * Class Purpose: This class gets the users' input. <br>
 *
 * <hr>
 * Date created: 7/30/19 <br>
 * Date Last Modified: 7/30/19
 * @author Adam Wells
 */

public class UserInput
{
    private Scanner reader;     //reader scanner field

    /*
     * Method Name: UserInput <br>
     * Method Purpose:The constructor creates a new InputReader that reads text from the text terminal. <br>
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
    public UserInput()
    {
        reader = new Scanner(System.in);
    }

    /*
     * Method Name: getInput <br>
     * Method Purpose: This method reads a line of text from standard input (the text terminal),
     * and return it as a trimmed, lowercase String.  <br>
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
     *	@return String - A HashSet typed by the user.
     */

    public String getInput()
    {
        System.out.print("> ");// print prompt
        return reader.nextLine().trim().toLowerCase();

    }

}
