/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Solution{    public static void main (String[] args) throws java.lang.Exception	{	    int n;        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                n = Integer.parseInt(br.readLine());        String s[] = br.readLine().split(" ");        int arr[] = new int[n];        arr[0] = Integer.parseInt(s[0]);        int ans = Math.abs(180-arr[0]);        for(int i = 1; i < n; i++) {            arr[i] += arr[i-1] + Integer.parseInt(s[i]);            ans = Math.min(ans, Math.abs(arr[i]-180));        }        for(int i = 0; i < n; i++) {            for(int j = i; j < n; j++) {                int angle = arr[j]-arr[i];                ans = Math.min(Math.abs(angle-180), ans);            }        }        System.out.println(ans*2);		// your code goes here	}}