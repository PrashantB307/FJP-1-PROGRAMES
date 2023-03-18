import java.util.*;

public class Main01 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d = scn.nextInt();
    int f = getDigitFrequency(n, d);
    System.out.println(f);
    scn.close();
  }

  public static int getDigitFrequency(int n, int d) {
    int div, c = 0;
    while (n != 0) {
      div = n % 10;
      if (div == d)
        c++;
      n = n / 10;
    }
    return c;
  }
}
