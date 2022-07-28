import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = t==0?"":"\n";
			long n = sc.nextLong();
			long u = sc.nextLong();
			long v = sc.nextLong();
			long arr[] = new long[(int)n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextLong();
			}
			long min = Long.MAX_VALUE;
			for(int i=0;i<n-1;i++) {
				if(Math.abs(arr[i]-arr[i+1])>1) {
					min = 0;
				}else if(arr[i]==arr[i+1]){
					min = Math.min(min,Math.min(u+v,2*v));
				}else {
					min = Math.min(min,Math.min(u,v));
				}
			}
			System.out.print(min+str);
		}
	}
}
