import java.util.Scanner; public class Solutions{	static long dp[][];	public static void main(String[] args){		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int b = sc.nextInt();		int arr[] = new int[n];		for(int i=0;i<n;i++)			arr[i] = sc.nextInt();		int c[] = new int[n];		c[n-1] = arr[n-1];		for(int i=n-2;i>=0;i--)			c[i] = Math.max(c[i+1],arr[i]);		int max = b;		for(int i=0;i<n;i++){			int temp = b%arr[i]+(b/arr[i])*c[i];			if(temp>max)				max = temp;		}		System.out.println(max);	}}