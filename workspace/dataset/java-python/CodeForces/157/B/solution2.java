import java.util.*; public class Trace_B { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int arr[] = new int[n];		for(int i = 0; i<n ;i++) {			arr[i] = sc.nextInt(); 		}		double ans = 0;		Arrays.sort(arr);		double f = -1; 			for(int i = n-1; i>=0; i--) {				f = f*-1;				ans += f*arr[i]*arr[i];			}						ans = Math.PI*ans;		System.out.println(ans); 	} }
