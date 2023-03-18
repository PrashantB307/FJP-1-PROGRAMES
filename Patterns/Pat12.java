import java.util.Scanner;

public class Pat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int st=1;
        int sp=n/2;
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            int ival=val;
            for(int j=1;j<=st;j++){
                System.out.print(ival+"\t");
                if(j<=st/2)
                ival++;
                else
                ival--;
            }
            if(i<=n/2)
            {
                st+=2;
                sp--;
                val++;
            }
            else{
               st-=2;
               sp++;
               val--;
            }
            System.out.println();
        }
        sc.close();
    }    
}
