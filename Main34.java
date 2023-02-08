import java.util.Scanner;

public class Main34 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                boolean ispalindrom=ispalindrom(sub);
                if(ispalindrom==true){
                    System.out.println(sub);
                }
            }
        }
        sc.close();
    }
    public static boolean ispalindrom(String sub){
        boolean flag=true;
        int left=0;
        int right=sub.length()-1;
        while(left<right){
            char chleft=sub.charAt(left);
            char chright=sub.charAt(right);
            if(chleft != chright){
                flag=false;
                break;
            }
            left++;
            right--;
        }
        return flag;
    }
    
}
