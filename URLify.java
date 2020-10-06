public class URLify {
    public static void main(String[] args) {
        urlify("Mr John Smith    ", 13);
    }

    public static void urlify(String str, Integer lenght) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            if(!(str.charAt(i) == ' ')) {
                sb.append(str.charAt(i));
            } else {
                sb.append("%20");
            }
        }

        System.out.println("\"" + str + "\"");
        System.out.println("\"" + sb.toString() + "\"");
    }
}
