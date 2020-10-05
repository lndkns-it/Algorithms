import java.util.ArrayList;
import java.util.Collections;

public class MissingPositive {

    public static void main(String[] args) {
        Integer[] array = {3, 4, -1, 1};
        // Integer[] array = {1, 2, 0};
        // Integer[] array = {2, 0, 2};
        System.out.println(calculateMissingPositive(array));
    }

    public static Integer calculateMissingPositive(Integer[] array) {
        ArrayList<Integer> positiveNumbers = new ArrayList<Integer>();
        if(array.length != 0) {
            for(int i = 0; i < array.length; i ++) {
                if (array[i] >= 0) {
                    positiveNumbers.add(array[i]);
                }
            }

            Collections.sort(positiveNumbers);

            Integer minPositive = 0;
            for(int i = 0; i < positiveNumbers.size() - 1; i++) {
                Integer delta = positiveNumbers.get(i + 1) - positiveNumbers.get(i);
                if (delta != 1 && delta != 0){
                    minPositive = positiveNumbers.get(i) + 1;
                } 
            
            }
            if(minPositive == 0){
                minPositive = positiveNumbers.get(positiveNumbers.size() - 1) + 1;
            }
            return minPositive;
            
        }

        return -1;
    }

}