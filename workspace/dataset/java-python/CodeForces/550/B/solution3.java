import java.util.Scanner; public class SbuSeq { 	public static void main(String[] args) {		// TODO Auto-generated method stub		//System.out.println(12 >> 1);		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int l = sc.nextInt();		int r = sc.nextInt();		int x = sc.nextInt();		int[] arr = new int[n];		for (int i = 0; i < arr.length; i++) {			arr[i]=sc.nextInt();		}		problem_Set(n, arr, l, r, x); 	} 	public static int Fast_Set(int n) {		int count = 0;		while (n > 0) {			count++;			n = (n & (n - 1));		}		return count;	} 	public static void problem_Set(int n, int[] arr, int l, int r, int x) {		int ans =0;		for (int i = 0; i < (1 << n); i++) {			if(Fast_Set(i)>=2) {				if(isitpossible(arr,l,r,x,i)) {					//System.out.println("hey");					ans++;				}			} 		}		System.out.println(ans); 	} 	public static boolean isitpossible(int[] arr, int l, int r, int x, int i) {		// TODO Auto-generated method stub		int pos =0;		int min = Integer.MAX_VALUE;		int max = Integer.MIN_VALUE;		int sum =0;		while(i>0) {			if((i&1)==1) {				sum+=arr[pos];				min=Math.min(min, arr[pos]);				max=Math.max(max, arr[pos]);			}			pos++;			i>>=1;		}		return (max-min)>=x && sum>=l && sum<=r;	} 	public static void SubSequancy(String str) {		int n = str.length();		for (int i = 0; i < (1 << n); i++) {			pattern(str, i); 		}	} 	public static void pattern(String str, int i) {		int pos = 0;		while (i > 0) {			if ((i & 1) == 1) {				System.out.print(str.charAt(pos));			}			pos++;			i >>= 1;		}		System.out.println();	} }