/*
 * ---------------------------------------------------------------------------
 * File name: Scoring
 * Project name: USTrivia
 * ---------------------------------------------------------------------------
 * Creator's name and email: Adam Wells, wellsay@etsu.edu
 * Course: CSCI-1250-090
 * Creation Date: 7/30/19
 * ---------------------------------------------------------------------------
 */

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Class Name: Scoring.java <br>
 * Class Purpose: This class calculates and adds the scores to the players. <br>
 *
 * <hr>
 * Date created: 7/30/19 <br>
 * Date Last Modified: 7/30/19
 * @author Adam Wells
 */

public class Scoring
{

    private ArrayList<Integer> points;  //ArrayList field for points

    /*
     * Method Name: Scoring <br>
     * Method Purpose: No args constructor news up ArrayList. <br>
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
    public Scoring()
    {
        points= new ArrayList<>();
    }

    /*
     * Method Name: addPoints <br>
     * Method Purpose: Adds points to the arraylist. <br>
     *
     * <hr>
     * Date created: 7/28/2019 <br>
     * Date last modified: 7/30/2019 <br>
     *
     * <hr>
     *
     *
     * <hr>
     *	@param int i
     *	@return
     */
    public void addPoints (int i)
    {
        points.add(i);
    }

    /*
     * Method Name: Scoring <br>
     * Method Purpose: This method adds up all the scores contained in the ArrayList "points." <br>
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
     *	@return int - the players score
     */
    public int totalScore()
    {
        int sum = 0;
        Iterator<Integer> iterator=points.iterator();
        while(iterator.hasNext())
        {
            sum+=iterator.next();
        }
        return sum;
    }

}

