/* package codechef; // don't place package name! */ import java.util.Scanner;import java.util.Arrays;/* Name of the class has to be "Main" only if the class is public. */public class Codechef{	public static void main (String[] args) throws java.lang.Exception	{		try {		    Scanner sc = new Scanner(System.in);		    int n,i,c,k;		    n=sc.nextInt();		    int a [] = new int[100];		    for(i=0;i<n;i++)		     a[sc.nextInt()-1]++;		     c=0;		     for(i=0;i<100;i++)		     {		         a[i]=a[i]/2;		         c=a[i]+c;		     }		     System.out.println(c/2);		    } catch(Exception e) {		}	}}
