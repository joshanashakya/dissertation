import java.util.*;public class P2 { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n  =sc.nextInt();		int k=sc.nextInt();		int x=sc.nextInt();				int a[]=new int[n];		for(int i=0;i<n;i++) {			a[i]=sc.nextInt();							}		int sum=0;		for(int i=0;i<n-k;i++) {			sum+=a[i];		}		System.out.println(sum+(k*x));						}	}