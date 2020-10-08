public class WaysToDecode {
    public static void main(String[] args) {
        String digits = "13126";
        System.out.println(decode(digits.toCharArray(), digits.length()));
    }

    public static int decode(char[] code, int n) {
        Integer ways = 0;

        if(n == 0 || n == 1)
            return 1;

        if(code[0] == '0')
            return 0;

        if(code[n - 2] == '1' || (code[n - 2] == '2' && code[n - 1] < '7')){
            ways+= decode(code, n - 2);
        }
            
        if(code[n - 1] > '0') {
            ways+= decode(code, n - 1);
        }
    
        return ways;
    }

}
