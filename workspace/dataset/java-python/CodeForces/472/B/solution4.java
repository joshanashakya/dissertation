import java.util.*;import static java.lang.Math.*;import java.io.*; public class SolutionB {      public static void main(String args[])throws IOException{              Scanner sc = new Scanner(System.in);              int n = sc.nextInt();              int k = sc.nextInt();              int a[] = new int[n];              for(int i = 0; i < n; i++)                     a[i] = sc.nextInt();              Arrays.sort(a);              int ans = 0;              int cnt = 0;              for(int i = n - 1; i >= 0; i--){                     if(cnt % k == 0){                            ans += ((a[i] - 1)*2);                     }                     cnt++;              }              System.out.println(ans);      }}