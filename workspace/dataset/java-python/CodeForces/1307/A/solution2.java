import java.util.Scanner; public class A { 	public static void main(String[] args)	{		Scanner sc = new Scanner(System.in);				int t = sc.nextInt();				while(t-->0)		{			int n = sc.nextInt();			int d = sc.nextInt();						int[] arr = new int[n];			for(int i=0;i<n;i++)				arr[i] = sc.nextInt();						while(d>0)			{				for(int i=1;i<n;i++)				{					if(arr[i]>0)					{						arr[i-1]++;						arr[i]--;						break;					}				}				d--;			}						System.out.println(arr[0]);					}			}	} 	   		 		   	 	 			   	 	 	   	