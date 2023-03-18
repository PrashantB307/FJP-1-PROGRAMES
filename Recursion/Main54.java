import java.util.*;

public class Main54 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String str=sc.nextLine();
        ArrayList<String>words=getKPC(str);
        System.out.println(words);

        sc.close();
    }

    public static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch =str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String>rres=getKPC(ros);
        ArrayList<String>mres=new ArrayList<>();

        String code=codes[ch-48];
        for(int i=0;i<code.length();i++){
            char chi = code.charAt(i);
            for(String rstr: rres){
                mres.add(chi + rstr);
            }
        }

        return mres;
    }

}
