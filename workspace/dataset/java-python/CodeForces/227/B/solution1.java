import java.io.*;import java.util.*;public class MyClass {    public static void main(String args[]) throws IOException{        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        int n = Integer.parseInt(br.readLine());        String s[] = br.readLine().split(" ");        int m = Integer.parseInt(br.readLine());        String str[] = br.readLine().split(" ");        int arr[] = new int[n+1];        for(int i=0;i<n;i++){            int val = Integer.parseInt(s[i]);            arr[val] = i+1;        }        long sum1 = 0;        long sum2 = 0;        for(int i=0;i<m;i++){            int val = Integer.parseInt(str[i]);            sum1+=arr[val];            sum2+=n-arr[val]+1;        }        System.out.println(sum1+" "+sum2);    }}