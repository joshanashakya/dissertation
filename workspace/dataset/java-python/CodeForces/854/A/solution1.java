import java.util.*;import java.io.*;public class Main{	public static void main(String[] args) {	    Scanner sc = new Scanner(System.in);	    int n = sc.nextInt();	    boolean flag = false;	    int res1 = 0 ; int res2 = 0 ; 	    for(int i =  2; i <= n/2 ; i ++ ) {	        if (factors(i , n-i) ) {	            flag = true; res1 = i ; res2 = n-i ;	    }	    }	    if(!flag) pw.println(1 + " " + (n-1));	    else pw.println(res1 + " " + res2);	   // pw.println(502 % 497) ;	    	    pw.close();					}	static PrintWriter pw = new PrintWriter(System.out);	public static boolean factors (int x , int y ) {	    boolean flag = true;	    for (int i = 2 ; i <= Math.min(x,y) ; i ++ ){	        if (x%i == 0 && y%i == 0 ){	            return false;	        }	    }	    return flag;	}}				      		 	    		     		
