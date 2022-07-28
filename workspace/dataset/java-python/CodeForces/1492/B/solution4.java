import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

	private static int MAX = 100001;

	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int i = 1;
			int[] v = new int[n], m = new int[n+1];
			for(i=0;i<n;i++){
				v[i] = sc.nextInt();
				m[i+1] = 1;
			}
			int mp = n; i=n-1; int j=n, x=0, y=n;
			//System.out.println(mp);
			while(i>=0){
				while(i>=0 && v[i]!=mp){
					m[v[i]]=0;
					i--;
				}
				m[mp]=0;
				while(j>=1 && m[j]==0){
					j--;
				}
				mp=j;
				//System.out.println(j);
				for(x=i; x<y; x++){
					System.out.print(v[x] + " ");
				}
				y=i;
				i--;
			}
			System.out.println();
			t--;
		}
	}
}
