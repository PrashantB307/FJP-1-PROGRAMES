import java.util.*;

public class Main09{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max)
        max=arr[i];
    }
    int ht;
    for(ht=max;ht>=1;ht--){
        for(int i=0;i<n;i++){
            if(arr[i]>=ht)
            System.out.print("*\t");
            else
            System.out.print("\t");
        }
        System.out.println();
    }
    sc.close();
 }

}