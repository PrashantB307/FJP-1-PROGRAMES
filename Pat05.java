import java.util.Scanner;

public class Pat05{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" \t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                space=space-1;
                star=star+2;
            }
            else{
                space=space+1;
                star=star-2;
            }

        }
        sc.close();
        
    }
    
}
