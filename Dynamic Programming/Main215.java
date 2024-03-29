import java.util.*;

public class Main215 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][]arr = new int[n][3];

        for(int i = 0; i < arr.length; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        } 

        int red = arr[0][0];
        int green = arr[0][1];
        int blue = arr[0][2];

        for(int i = 1; i < arr.length; i++){
            int nred = Math.min(green, blue) + arr[i][0];
            int ngreen = Math.min(red, blue) + arr[i][1];
            int nblue = Math.min(green, red) + arr[i][2];

            red = nred;
            green = ngreen;
            blue = nblue;
        }

        System.out.println(Math.min(red, Math.min(green, blue)));

        sc.close();
    }
}