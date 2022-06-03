package com.revature.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int validWords(String sentence) {

        Stack<Character> words = new Stack<>();
        int anw = 0;

        boolean checkedFirst = false;
        boolean isLastChar =false;
        boolean isValid = true;
        char check;
        char last= ' ';
        int hcount = 0;
        List<Character> pun = new ArrayList<>();
        pun.add('?');
        pun.add(',');
        pun.add('!');

        for (char c: sentence.toCharArray()){
            if(c == ' '){
                // check if stack is empyt
                if(words.size() > 0){
                    while(!words.isEmpty()){
                        check = words.peek();
                        // case 1: c is a letter
                        if(Character.isAlphabetic(check)){
                            last = words.pop();
                            checkedFirst = true;
                        }
                        else if(!checkedFirst && pun.contains(check)){
                            last = words.pop();
                            checkedFirst = true;
                        }
                        // case 4 c in middle
                        else if (checkedFirst && Character.isAlphabetic(last) && check == '-'){
                            last = words.pop();
                            hcount++;
                        }else{
                            isValid =false;
                            break;
                        }

                    }
                    if(isValid && Character.isAlphabetic(last)){
                        anw++;
                    }
                }

                //else go on
            }
            else{
                words.push(c);
            }

        }

        return anw;
    }
}
