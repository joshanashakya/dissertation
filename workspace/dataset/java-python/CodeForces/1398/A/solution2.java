import java.util.*;
import java.util.Arrays;
public class BadTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int [] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			if(arr[0]+arr[1]<=arr[n-1])
				System.out.println(1+" "+2+" "+n);
			else
				System.out.println(-1);
		}
	}

}

