import java.util.ArrayList;
import java.util.Arrays;


public class StringPalindrome {
    public static void main(String[] args) {
        String probs = "ANJ,JFH,JJ,ABBA,BAB,a,bbcbb,cgd,cbfbc,hdfcl,AZOROZA,acDmdCA";
        String p ="" ;
        System.out.println(palindrome(p));

    }

    static String palindrome (String arg) {
        if (arg.equals("")|| arg.equals(" ")) return "null";

        ArrayList<String> u = new ArrayList<>(Arrays.asList(arg.split(",")));
        StringBuilder tyring = new StringBuilder();
        for (int i = 0; i < u.size(); i++) {
            int start = 0, end = u.get(i).length() - 1;
            while (start < end) {
                if (Character.toUpperCase(u.get(i).charAt(start)) != Character.toUpperCase(u.get(i).charAt(end))) {
                    u.remove(i);
                    break;
                }
                start++;
                end--;
            }
        }
        u.sort(String::compareToIgnoreCase);
        for (String i : u) {
            tyring.append(i);
            tyring.append(", ");
        }
        arg = tyring.toString();
        return arg;
    }


}