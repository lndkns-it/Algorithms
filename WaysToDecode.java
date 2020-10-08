import java.util.ArrayList;

public class WaysToDecode {
    public static void main(String[] args) {
        
    }

    public static void decode(Integer code) {
        ArrayList<String> validPairs = new ArrayList<String>();
        String number = code.toString();
        Integer waysToDecode = 0;
        for(int i = 0; i < number.length(); i++) {
            Integer partial = Integer.parseInt(number.substring(i, i + 2));
            if(partial <= 26) {
                validPairs.add(partial.toString());
                waysToDecode++;
            }
        }

        Integer arraySize = validPairs.size();
        Integer cont = 0;

        Integer calc = calculateWays(validPairs, arraySize, cont, number);
    }

    public static Integer calculateWays(ArrayList<String> validPairs, Integer arraySize, Integer cont, String number){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arraySize; i++) {
            sb.append(validPairs.get(i));
            if(sb.toString().length() <= number.length()) {
                
            }
        }
        return cont;
    }
}
