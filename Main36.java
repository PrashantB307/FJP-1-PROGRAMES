import java.util.Scanner;
public class Main36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int ls=0;
            for(int j=0;j<i;j++){
                ls=ls+arr[j];
            }
            int rs=0;
            for(int k=i+1;k<n;k++){
                rs=rs+arr[k];
            }
            if(ls==rs)
            System.out.println(i);
        }
        System.out.println("-1");
        sc.close();
    }
    
}
