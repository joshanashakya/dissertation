import java.util.*;import java.math.*;public class Mountain{	public static void main(String[] args)		{			Scanner sc = new Scanner(System.in);			int n = sc.nextInt()*2;			int k = sc.nextInt();			int[] arr = new int[n+1];			for(int i = 0;i<n+1;i++)				arr[i] = sc.nextInt();			for(int i = 1;i<n;i++)			{				if(arr[i]-1>arr[i-1]&&arr[i]-1>arr[i+1])				{					k--;					arr[i]--;				}				if(k==0)					break;			}			for(int i = 0;i<n+1;i++)				System.out.print(arr[i]+" ");		}}	
