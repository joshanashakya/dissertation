import java.util.*;import java.lang.*;import java.io.*; public class Main{	public static void main (String[] args) throws java.lang.Exception	{		Scanner scan = new Scanner(System.in);		long resSum = Long.MIN_VALUE;		long n = scan.nextInt();		long p = scan.nextInt();		long q = scan.nextInt();		long r = scan.nextInt();		long[] arr = new long[(int) n];		for(int i=0;i<n;i++) {			arr[i] = scan.nextInt();		}		long[] preMax = new long[(int) n];		long[] suffMax = new long[(int) n];		preMax[0] = p * arr[0];		suffMax[(int) (n-1)] = r * arr[(int) (n-1)];		for(int i = 1;i < n;i++) {			preMax[i] = preMax[i-1] > (p * arr[i]) ? preMax[i-1] : (p * arr[i]);		}		for(int i = (int) (n-2);i >= 0;i--) {			suffMax[i] = suffMax[i+1] > (r * arr[i]) ? suffMax[i+1] : (r * arr[i]);		}		for(int i=0;i<n;i++) {			long temp = preMax[i] + q * arr[i] + suffMax[i];			resSum = resSum > temp ? resSum : temp;		}		System.out.println(resSum);	}}
