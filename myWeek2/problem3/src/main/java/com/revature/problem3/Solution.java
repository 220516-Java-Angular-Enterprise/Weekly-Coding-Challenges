package com.revature.problem3;

import java.util.*;

class wordCountObj {
    String word;
    int count;

    @Override
    public int compareTo(wordCountObj other) {
        return word.compareTo(other.getWord());
    }

    public wordCountObj(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return  word.toLowerCase() + ": " + count + "\n";
    }
}

public class Solution {


    public String wordCount(String sentence) {
        List<String> split = Arrays.asList(sentence.split(" "));
        String str = "";


        List<wordCountObj> list = new ArrayList<>();
        list.add(new wordCountObj(split.get(0), 1));

        for (int i = 1; i < split.size(); i++ ) {
            foundWord:
            {
                for (int j = 0; j < list.size(); j++) {
                    if (split.get(i).equalsIgnoreCase(list.get(j).getWord())) {
                        list.get(j).setCount(list.get(j).getCount() + 1);
                        break foundWord;
                    }
                }
                list.add(new wordCountObj(split.get(i), 1));
            }
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++ ) {
            if (list.get(i).getCount() > 1)
                str += list.get(i).getWord().toLowerCase() + ": " + list.get(i).getCount() + "\n";
        }
        return str;
    }
}
