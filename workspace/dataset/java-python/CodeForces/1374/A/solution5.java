import java.util.*;import java.io.*; public class Main{	public static void main(String[] args) {				Scanner sc= new Scanner(System.in);				int t=sc.nextInt();		while(t-->0) {							int x=sc.nextInt();			int y=sc.nextInt();			int n=sc.nextInt();						int m=((n/x)*x)+y;						if(m>n) {				m-=(x);			}			System.out.println(m);			}	}		};