import java.util.Random;

public class UpperTriangularMatrix {
   public static void main(String[] args) {
       Random random = new Random();
       int n = 5;
       int [][] matrix = new int [n][n];
       for (int i=0; i < n; i++){
           for (int j=0; j< n;j++){
               matrix[i][j] = random.nextInt(10);
           }
       }
       for (int i=0;i<n;i++) {
           for (int j=0;j<n;j++)
            System.out.print(matrix[i][j]+ " ");
           System.out.println();
       }
       System.out.println();
       for (int i=0; i < n; i++){
        for (int j=i+1; j< n;j++){
            matrix[i][j] = 0;
        }
    }
    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++)
        System.out.print(matrix[i][j]+ " ");
            System.out.println();
    }
   } 
}
