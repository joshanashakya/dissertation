import java.util.*;public class P2 { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n  =sc.nextInt();			int a[]=new int[101];	for(int i=0;i<n;i++) {		int s=sc.nextInt();		for(int j=0;j<s;j++) {			int p=sc.nextInt();			a[p]++;			if(a[p]==n)System.out.print(p+" ");		}	}}}