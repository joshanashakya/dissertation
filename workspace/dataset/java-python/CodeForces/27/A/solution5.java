/* package whatever; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Ideone{	public static void main (String[] args) throws java.lang.Exception	{		// your code goes here		Scanner sc = new Scanner(System.in) ;		int n  =sc.nextInt() ;		int arr[] = new int[3002] ;		for(int i = 0 ; i < n ; i++)		arr[sc.nextInt()] = 1 ;		int ans = 0 ;		for(int i = 1 ; i < 3002 ; i++){			if(arr[i] == 0){			ans = i ;			break ;			}		}		System.out.println(ans) ;		}}