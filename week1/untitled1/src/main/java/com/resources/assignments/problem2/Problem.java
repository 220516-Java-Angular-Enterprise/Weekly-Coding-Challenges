package main.java.com.resources.assignments.problem2;

import java.util.ArrayList;
import java.util.List;

public class Problem {

    public List<String> newList(int n) {
        List<String> list = new ArrayList<String>();
        int i;
        for (i=1; i<=n; i++ ) {

            if (i % 3 ==0  && i% 5 ==0) {
//                System.out.println("abracadabra");
                list.add("abracadabra");
            }
            else if (i % 3 ==0) {
                list.add("abraca");
            }
            else if (i % 5 ==0) {
                list.add("dabra");
            }
            else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
