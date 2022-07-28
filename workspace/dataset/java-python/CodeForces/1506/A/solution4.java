/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0){
		    long n = sc.nextLong();
		    long m = sc.nextLong();
		    long x = sc.nextLong();
		    
		    solve(n,m,x);
		}
	}
	
	public static void solve(long n, long m, long x){
	    
	    x--;
	    
	    long row = x % n;
	    long col = x / n;
	    
	    System.out.println(row * m + col + 1);
	}
}

