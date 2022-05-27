import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        Solution2 test = new Solution2();
        List<String> myList = new ArrayList<>();
        myList.add("do");
        myList.add("dog");
        myList.add("cat");
        myList.add("bird");
        myList.add("donut");
        myList.add("cake");
        myList.add("dough");

        System.out.println(test.autoComplete(myList));

    }
}
