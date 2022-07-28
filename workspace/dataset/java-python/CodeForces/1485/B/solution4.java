import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int q = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<n;i++)
				arr[i] = sc.nextInt();
			while(q-->0)
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				int out = 0;
				out = k+arr[b-1]-arr[a-1]-2*(b-a)-1;
				System.out.println(out);
			}
		}
}
