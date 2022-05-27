package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Answer {
    public List<String> autoComplete(List<String> list) {
        String prefix = list.get(0);
        List<String> answer = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            try {
                if (prefix.equals(list.get(i).substring(0, prefix.length()))) answer.add(list.get(i));
            } catch (IndexOutOfBoundsException ignore) { }
        }

        Collections.sort(answer);
        return answer;
    }
}
