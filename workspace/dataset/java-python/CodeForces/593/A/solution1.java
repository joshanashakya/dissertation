/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Codechef{	public static void main (String[] args) throws java.lang.Exception	{		// your code goes here		Scanner sc = new Scanner(System.in) ;		int n = sc.nextInt() ;		String[] str = new String[n] ;		for(int i = 0 ; i < n ; i++)		str[i]= sc.next() ;		int ans = 0 ;		for(int i = 0 ; i < 26 ; i++){		       for(int j = i+1 ;  j < 26 ; j++){		              int c = 0 ;		              for(int k = 0 ; k < n ;k++){		                     int cc = 0 ;		                     for(int l = 0 ; l < str[k].length() ; l++){		                            char a = str[k].charAt(l) ;		                            if( a -'a' == i || a -'a'== j )cc++ ;		                            else {		                                   cc = 0 ;		                                   break ;		                            }		                     }		                     c+=cc;		              }		              ans = ans < c ? c : ans ;		       }		}		System.out.println(ans) ;	}}
