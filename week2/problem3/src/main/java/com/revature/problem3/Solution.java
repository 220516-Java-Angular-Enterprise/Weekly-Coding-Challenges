package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
    //make a hashtable of key value pairs

        Hashtable<String, Integer> wordCounter = new Hashtable<String, Integer>();

        //split the input sentence into an array of strings delimited by space
        String[] sentenceWords=sentence.split(" ");
        //loop through our array
        for (String s : sentenceWords){
            //turn the word into a key with a regex that returns the word in all lowercase

            //if the key does not exist in the hashtable, add it, with an initial value of 1

            //else if the key already exists in the hashtable, increment its associated value by 1.
        }
        //make a string for output
        String outStr = "";
        //Obtain a list of the keys in the hashtable
        //Sort it
        //Loop through the list of keys, if the value associated with the key >1, append key + : + value+\n to output


    }
}
