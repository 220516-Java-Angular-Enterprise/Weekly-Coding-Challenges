package main.java.com.revature.problem3;

import java.util.*;

public class Answer {
    public String wordCount(String sentence) {
        StringBuilder sb = new StringBuilder();
        List<String> list = wordToList(sentence.toLowerCase());
        Map<String, Integer> map = new LinkedHashMap<>();

        Collections.sort(list);

        for (String s : list) {
            if (!map.containsKey(s)) map.put(s, 1);
            else map.put(s, map.get(s) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        return sb.delete(sb.length() - 1, sb.length()).toString();
    }

    private List<String> wordToList(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (char c : arr) {
            if (c != ' ') sb.append(c);
            else {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            }
        }

        if (sb.length() > 0) list.add(sb.toString());

        return list;
    }
}
