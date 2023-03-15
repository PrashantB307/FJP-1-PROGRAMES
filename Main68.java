import java.util.*;

public class Main68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tar=sc.nextInt();
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]>tar){
                right--;
            }else if(arr[left]+arr[right]<tar){
                left++;
            }else{
                System.out.println(arr[left]+"-"+arr[right]);
                left++;
                right++;
            }
        }

        sc.close();
    }
    
}
