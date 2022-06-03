package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/*Implement an autocomplete system. That is, given a query string `s` and a set of all possible query strings, return all
strings in the set that have `s` as a prefix (in alphabetical order).
The query string is given on the first line of the input, followed by all the possible query strings on the subsequent
lines.*/
/*A query string is the portion of a URL where data is passed to a web application and/or back-end database. */
/*Set in Java is an interface declared in java.util package. It extends the collection interface that allows creating an
 unordered collection or list, where duplicate values are not allowed. As the name implies, a set in Java is used to create a mathematical set.
 */

public class Solution {
    public List<String> autoComplete(List<String> list) {
<<<<<<< HEAD
        throw new RuntimeException("TODO! Needs implementation...");

=======
        //Collections has a sort method.  Let's use that.
        List<String> sortedList = list.subList(1,list.size());
        Collections.sort(sortedList);
        //now we can use the input to search through the list.
        List<String> outList = new ArrayList<String>();
        String inStr = list.get(0);
        for (String s : sortedList){
            //Make sure we're not comparing to a string that's too long:
            //It took me half an hour to figure out that I put '>' instead of '<'

            if (s.length()>=inStr.length()) {
                //if the first inStr.length() chars in substring match, add to output

                if (s.substring(0, inStr.length()).contains(inStr)) {

                    outList.add(s);
                }
            }
        }

        return outList;
>>>>>>> ab3f71d9b33575f640efc05ceb05fb920f42ff43
    }
}
// Answer for problem 2
String prefix=list.get(0);
List<String>