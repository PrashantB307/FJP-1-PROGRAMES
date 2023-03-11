import java.util.*;

public class Main53 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String>paths=getStairPaths(n);
        System.out.println(paths);

        sc.close();

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String>bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String>bres=new ArrayList<>();
            return bres;
        }

        ArrayList<String>paths1=getStairPaths(n-1);
        ArrayList<String>paths2=getStairPaths(n-2);
        ArrayList<String>paths3=getStairPaths(n-3);

        ArrayList<String>pathsfromn=new ArrayList<>();
        for(String path1 : paths1){
            String pathfromn = "1"+ path1;
            pathsfromn.add(pathfromn);
        } 
        for(String path2 : paths2){
            String pathfromn = "2"+ path2;
            pathsfromn.add(pathfromn);
        } 
        for(String path3 : paths3){
            String pathfromn = "3"+ path3;
            pathsfromn.add(pathfromn);
        } 


        return pathsfromn;
    }

}