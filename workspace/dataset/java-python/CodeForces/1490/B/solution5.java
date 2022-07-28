/*
https://codeforces.com/contest/1490/problem/B
**/
import java.util.Scanner;

public class Solution_2{
	public static void main(String[] args){
		int t, n;
		
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0){
			n = sc.nextInt();
			int[] c = new int[3];
			for(int i=0; i<n; i++){
				c[sc.nextInt()%3]++;
			}
			System.out.println(solve(c, n/3));
		}

	}
	static int solve(int[] c, int b){
		
		int res = 0;
		for (int i=0;i<2;i++){
			if (c[0]>b){
				res += c[0]-b;
				c[1] += c[0]-b;
				c[0] = b;
			}
			if(c[1]>b){
				res+=c[1]-b;
				c[2]+=c[1]-b;
				c[1]=b;
			}
			if(c[2]>b){
				res+=c[2]-b;
				c[0]+=c[2]-b;
				c[2]=b;
			}
		}
		return res;
	}
}
