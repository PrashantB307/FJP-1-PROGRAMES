import java.util.*;

public class Main58 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String str=sc.nextLine();
        printPermutations(str, "");

        sc.close();

    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return ;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String prei=str.substring(0, i);
            String posti=str.substring(i+1);
            String newstr=prei+posti;

            printPermutations(newstr, asf+ch);

        }
        
    }

}