import java.util.Scanner; public class Three_Matrices {    public static void main(String arg[]) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int[][] ar = new int[n][n];        for (int i = 0; i < n; i++) {            for (int j = 0; j < n; j++) {                ar[i][j] = sc.nextInt();            }        }         double[][] arrA = new double[n][n];        double[][] arrB = new double[n][n];        for (int i = 0; i < n; i++) {            for (int j = i; j < n; j++) {                arrA[i][j] = (1.0 * ar[i][j] + ar[j][i])/2;                arrB[i][j] = ar[i][j] - arrA[i][j];                arrA[j][i] = arrA[i][j];                arrB[j][i] = 0.0 - arrB[i][j];            }        }         for(int i = 0; i<n; i++){            for(int j = 0; j<n; j++){                System.out.print(arrA[i][j]+ " ");            }            System.out.println();        }         for(int i=0; i<n; i++){            for(int j=0; j<n; j++){                System.out.print(arrB[i][j]+" ");            }            System.out.println();        }     }}