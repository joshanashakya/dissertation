import java.io.*;import java.util.*;public class Main{	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n = (int)sc.nextLong();		PrintWriter pw = new PrintWriter(System.out);		Long [] x = new Long[n];		for (int i = 0; i < n; i++) {			x[i] = sc.nextLong();		}		Arrays.sort(x);		int z = n/2;		if(n%2==0) {			for (int i = 0; i < z; i++) {				if(i!=0)					System.out.print(" ");				System.out.print(x[i]+" "+x[x.length-i-1]);			}		}		else {			for (int i = 0; i < z; i++) {				if(i!=0)					System.out.print(" ");				System.out.print(x[i]+" "+x[x.length-i-1]);			}			System.out.print(" "+x[z]);		}	}} 			 	 	  	        		 	 	 			 	