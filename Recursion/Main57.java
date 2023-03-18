import java.util.*;

public class Main57{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int dr=sc.nextInt();
        int rc=sc.nextInt();

        printMazePaths(0, 0, dr-1, rc-1, "");

        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr>dr || sc>dc)
        return;
        if(sc==dc && sr==dr){
            System.out.println(psf);
            return;
        }


        for(int jump=1;jump<=dc-sc;jump++){
            printMazePaths(sr, sc+jump, dr, dc, psf+"h"+jump);
        }

        for(int jump=1;jump<=dc-sc;jump++){
            printMazePaths(sr+jump, sc, dr, dc, psf+"v"+jump);
        }
        for(int jump=1;jump<=Math.min(dr-sr, dc-sc);jump++){
            printMazePaths(sr+jump, sc+jump, dr, dc, psf+"d"+jump);
        }
        
    }

}