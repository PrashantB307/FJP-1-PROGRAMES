import java.util.Scanner;

public class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num)
        {
            int rem = i%2;
            if(rem==0)
            System.out.println(i+" Even");
            else
            System.out.println(i+" Odd");
            i++;
        }
        sc.close();
    }
}