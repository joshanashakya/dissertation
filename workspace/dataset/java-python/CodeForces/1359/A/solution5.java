import java.util.Scanner; public class _0607BerlandPoker {		static int BerlandPoker(int n,int m,int k) {		int single=n/k;		int jokers=Math.min(single, m);		int remainingJokers=m-jokers;		int ans=0;		if(remainingJokers<(k-1)) {			if(remainingJokers!=0) {			ans+=1;		}		}		else {			ans+=remainingJokers/(k-1);			if(remainingJokers%(k-1)!=0) {				ans++;			}		}		return jokers-ans;					} 	public static void main(String[] args) {						Scanner sc = new Scanner(System.in);		int cases=sc.nextInt();		while(cases>0) {		int n=sc.nextInt();		int m=sc.nextInt();		int k=sc.nextInt();		System.out.println(BerlandPoker(n, m, k));		cases--;		}	} }
