import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int i=num1;i<=num2;i++){
            boolean isPrime=true;
            int div=2;
            while(div*div<=i){
                int rem=i%div;
                if(rem==0){
                    isPrime=false;
                    break;
                }
                div++;
            }
            if(isPrime==true)
            System.out.println(i);

        }
        sc.close();
    }
    
}
