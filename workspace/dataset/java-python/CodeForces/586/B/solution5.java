import java.util.*;import static java.lang.Math.*;import java.io.*; public class SolutionB {       public static void main(String args[])throws IOException{             Scanner sc = new Scanner(System.in);             int n = sc.nextInt();             int a[][] = new int[2][n-1];             for(int i = 0; i < 2; i++){                    for(int j = 0; j < n - 1; j++){                           a[i][j] = sc.nextInt();                    }             }             int b[] = new int[n];             for(int i = 0; i < n; i++)                     b[i] = sc.nextInt();             int ans = 0;             int c[][] = new int[2][n];             for(int i = 1; i < n; i++){                    c[0][i] = c[0][i-1] + a[0][i-1];             }             c[1][0] = c[0][0] + b[0];             for(int i = 1; i < n; i++){                    c[1][i] = Math.min(c[0][i] + b[i], c[1][i-1] + a[1][i-1]);             }             ans = c[1][n-1];             int j = n-1;             while(j >= 0){                    if(c[1][j] - b[j] == c[0][j]){                            b[j] = 101;                            break;                    }else{                           j--;                    }             }             c = new int[2][n];             for(int i = 1; i < n; i++){                    c[0][i] = c[0][i-1] + a[0][i-1];             }             c[1][0] = c[0][0] + b[0];             for(int i = 1; i < n; i++){                    c[1][i] = Math.min(c[0][i] + b[i], c[1][i-1] + a[1][i-1]);             }             ans += c[1][n-1];              System.out.println(ans);      }}