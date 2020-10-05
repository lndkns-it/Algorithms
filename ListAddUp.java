import java.util.ArrayList;
import java.util.Arrays;

public class ListAddUp {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(15, 10, 3, 7));
        System.out.println(getAdditionElementsSecond(numbers, 17));
    }

    public static String getAdditionElements(ArrayList<Integer> numbers, Integer init, Integer k) {
        if(numbers.size() != 0) {
            for(int i = 1; i < numbers.size(); i++) {
                if(init + numbers.get(i) == k){
                    return "Elements: " + init + " and " + numbers.get(i) + ", are equals to " + k;
                } else{
                    if(i == numbers.size() - 1){
                        numbers.remove(0);
                        getAdditionElements(numbers, numbers.get(0), k);
                    }
                }
            }
        }
        return "No elements to calculate k number";
    }

    public static Boolean getAdditionElementsSecond(ArrayList<Integer> numbers, Integer k) {
        if(numbers.size() != 0) {
            for(Integer number : numbers) {
                if(numbers.contains(k - number)){
                    return true;
                } 
            }
        }
        return false;
    }


}
