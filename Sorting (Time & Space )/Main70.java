import java.util.*;

public class Main70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        arr=mergesort(arr,0,arr.length-1);

        for(int val:arr){
            System.out.print(val+" ");
        }

        sc.close();
    }
    public static int[] mergesort(int [] arr,int lo,int hi){
        if(lo==hi){
            int []ba=new int[1];
            ba[0]=arr[lo];
            return ba;
        }
        int mid=(lo+hi)/2;
        int[]fsh=mergesort(arr, lo, mid);
        int[]ssh=mergesort(arr, mid+1, hi);
        int[]fsa=merge2SortedArray(fsh,ssh);
        return fsa;
    }
    public static int[]merge2SortedArray(int[]a,int []b){
        int [] ans=new int[a.length + b.length];
    int i=0;
    int j=0;
    int k=0;
    while(i<a.length && j<b.length){
        if(a[i]<=b[j]){
            ans[k]=a[i];
            i++;
            k++;
        }
        else{
            ans[k]=b[j];
            j++;
            k++;
        }
    }
    if(i==a.length){
        while(j<b.length){
            ans[k]=b[j];
            j++;
            k++;
        }
    }else if(j==b.length){
        while(i<a.length){
            ans[k]=a[i];
            i++;
            k++;
        }
    }
    return ans;
    }
}
