import java.util.*;
public class Main33{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub=str.substring(i,j);
                System.out.println(sub);
            }
        }
        scn.close();
    }
}