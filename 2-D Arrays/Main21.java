public class Main21 {
    public static void main(String[] args) {
        int [][] arr =new int [3][4];
        arr[0][0]=12;
        arr[0][1]=13;
        arr[0][2]=14;
        arr[0][3]=15;

        arr[1][0]=12;
        arr[1][1]=13;
        arr[1][2]=14;
        arr[1][3]=15;
        
        arr[2][0]=12;
        arr[2][1]=13;
        arr[2][2]=14;
        arr[2][3]=15;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
    
}
