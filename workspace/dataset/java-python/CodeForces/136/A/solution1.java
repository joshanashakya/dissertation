import java.util.*;import java.lang.*;import java.io.*;   public class pyta  { 	public static void main(String args[])	 {	 	Scanner sc = new Scanner(System.in) ;	 	int n = sc.nextInt() ;	 	int arr[] = new int[n] ;	 	for(int j = 0 ; j<n ; j++)	 	{	 		arr[j] = sc.nextInt() ;	 	}	 	int ans[] = new int[n] ;	 	int t = 0 ;  	 	int p = 1 ; 	 	for(int b = 0  ; b<n ;  b++)	 	{	 	for(int a = 0 ; a<n  ; a++)	 	{	 		if(arr[a] == p)	 		{	 			ans[t] = a+1 ;	 			t++ ;	 			p++ ;	 		}	 	}	  }	  for(int i = 0 ; i<n ; i++)	  {	  	System.out.print(ans[i] + " ") ;	  }  } }