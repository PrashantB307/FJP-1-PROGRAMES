import java.util.*;

public class Main73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printkpc(str , "");

        sc.close();
    }
    static String[] codes=  {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkpc(String str , String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);
        String code =codes[ch-48];
        for(int i=0;i<code.length();i++){
            char chcode=code.charAt(i);
            printkpc(ros, asf + chcode);
        }
    }
    
}
