import java.util.*;import java.io.*; public class Main {	public static void main (String[] args) {	    Scanner input = new Scanner(System.in);		int n = input.nextInt();		int a[] = new int[n];		long sum=0;		for (int i=0; i<n;i++ )		{		    a[input.nextInt()-1] = i;		}		for (int i=0;i<n-1 ;i++ )		{		    sum+=Math.abs(a[i]-a[i+1]);		    		}		System.out.println(sum);	}}