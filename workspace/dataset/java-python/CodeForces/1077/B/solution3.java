import java.util.*;import java.lang.*;import java.io.*; public class sample{    public static void main(String args[]){        Scanner sc = new Scanner(System.in);        int n = sc.nextInt(), cnt = 0;        int arr[] = new int[n];         for(int i = 0; i < n; i++) arr[i] = sc.nextInt();         for(int i = 1; i <= n-2; i++){            if(arr[i-1] == 1 && arr[i] == 0 && arr[i+1] == 1){                cnt++;                arr[i+1] = 0;            }        }         System.out.println(cnt);    }}