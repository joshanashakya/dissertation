import java.io.*;import java.lang.*;import java.util.*; public class Solution{        public static void main(String[] args){                        Scanner scan = new Scanner(System.in);                int n= scan.nextInt();        int m = scan.nextInt();                int[] flowers = new int[n+1];                for(int i=1;i<=n;i++)         flowers[i] = scan.nextInt();                  int happiness = 0;                 while(m-->0){                        int l = scan.nextInt();            int r = scan.nextInt();                        int sum = 0;                        for(int i=l;i<=r;i++){                                sum = sum+flowers[i];            }                        happiness = Math.max(happiness,(happiness+sum));        }                System.out.println(happiness);    }}