/* Written by Preet Patel * Date: 2021-04-12 * FOR CODEFORCES SUBMISSIONS */import java.util.*; public class Main {     public static void main(String[] args) {         Scanner sc = new Scanner(System.in);         int n = sc.nextInt();         int[][] a = new int [n][3];        int[] rsSum = new int[n];         for (int i = 0; i < a.length; i++) {            for (int j = 0; j < a[i].length; j++) {                a[i][j] = sc.nextInt();            }        }         int count = 0;         for (int i = 0; i < a.length; i++) {            for (int j = 0; j < a[i].length; j++) {                rsSum[i] += a[i][j];            }                        if (rsSum[i] >= 2) {                count++;            }                    }         System.out.print(count);    }}