/* package whatever; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Ideone{	public static void main (String[] args) throws java.lang.Exception	{	Scanner scan=new Scanner(System.in);	int n=scan.nextInt();	int arr[]=new int[n];	for(int i=0;i<n;i++)	{		arr[i]=scan.nextInt();	}	Arrays.sort(arr);	for(int j=0;j<n;j++)	{		System.out.print(arr[j]+" ");	}	}}
