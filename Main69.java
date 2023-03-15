import java.util.*;

public class Main69{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tar=sc.nextInt();
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int ntar=tar-arr[i];

            int j=i+1;
            int k=arr.length-1;

            while(j<k){
                if(arr[j] + arr[k] > ntar){
                    k--;
                }else if(arr[j] + arr[k] < ntar){
                    j++;
                }else{
                    System.out.println(arr[i]+"-"+arr[j]+"-"+arr[k]);
                    j++;
                    k--;
                }
            }
        }

        sc.close();
    }
    
}
