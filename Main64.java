import java.util.Scanner;

public class Main64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        int []frc=new int[26];
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            int idx=ch-'a';
            frc[idx]++;
        }
        int maxidx=0;
        for(int i=1;i<frc.length;i++){
            if(frc[i]>frc[maxidx]){
                maxidx=i;
            }
        }
        char mfc=(char)(maxidx + 'a');
        System.out.println(mfc);

        sc.close();
    }
    
}
