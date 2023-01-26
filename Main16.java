import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int []arr=new int[n];
    int i;
    for( i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    } 
    int data=sc.nextInt();
    int l=0;
    int r=arr.length-1;
    int flor=-1;
    int seel=-1;
    while(l<=r){
        int mid=(l+r)/2;
        if(data>arr[mid]){
            l=mid+1;
            flor=arr[mid];
        }
        else if(data<arr[mid]){
            r=mid-1;
            seel=arr[mid];
        }
        else{
            seel=arr[mid];
            flor=arr[mid];
            break;
        }
    }
    System.out.println(seel);
    System.out.println(flor);
    }
}
