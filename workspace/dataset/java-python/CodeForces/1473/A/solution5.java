//package Justtt;import java.util.*;import java.math.*;public class Coding {	 	public static void main(String[] args) {		Scanner sc=new Scanner(System.in);		int t=sc.nextInt();						while(t--!=0)		{ 			int n=sc.nextInt();			int d=sc.nextInt();			int c=0;			int a[]=new int[n];			for(int i=0;i<n;i++) {				a[i]=sc.nextInt();				if(a[i]>d)					c++;			}			if(c!=0)			{ int min1=Integer.MAX_VALUE,ind1=0;				for(int i=0;i<n;i++)				{					if(a[i]<min1) {						ind1=i;						min1=a[i];					}				}				int min2=Integer.MAX_VALUE;				for(int i=0;i<n;i++)				{					if(i!=ind1&&a[i]<min2)						min2=a[i];				}				if(min1+min2<=d)					System.out.println("YES");				else					System.out.println("NO");			}			else {				System.out.println("YES");			}									}	}			}	  	      
