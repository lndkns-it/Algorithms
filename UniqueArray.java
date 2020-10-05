public class UniqueArray {

    public static void main(String[] args) {
        Boolean isUnique = true;
        String str = "Hola sk we";

        int i = 0;
        for (char current : str.toCharArray()) {
            
            int j = 0;
            for (char eval : str.toCharArray()) {
                
                if (i != j){
                    if(current != ' ' && current == eval) {
                        isUnique = false;
                        break;
                    }
                }
                j++;
            }
            i++;
        }

        System.out.println("String has unique characters: " + isUnique);
    }
    
}
