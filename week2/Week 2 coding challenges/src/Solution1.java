import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public int elementNotInArray(int[] arr, int k) {
        List<Integer> newList = new ArrayList<>();
      int answer = 0;
      int diff = 0;
      for(int n: arr){
          newList.add(n);
      }
      for(int i = 0; i < newList.size();i++){

          if(newList.get(i) > k){

              diff = newList.get(i);

          }


          System.out.println(diff);
      }


        return answer;
    }
}
