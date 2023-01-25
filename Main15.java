import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int data=sc.nextInt();
    int l=0;
    int h=arr.length-1;
    int foundat=-1;
    while(l<=h){
        int mid=(l+h)/2;
        if(data > arr[mid]){
            l=mid+1;
        }
        else if(data < arr[mid]){
            h=mid-1;
        }
        else{
            foundat=mid;
            break;
        }
    }
    System.out.println(foundat);
    sc.close();
    }
    
}
