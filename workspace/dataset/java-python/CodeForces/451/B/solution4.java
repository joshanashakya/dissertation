import java.util.*;import java.math.*;public class SortTheArray{	public static void main(String[] args)		{			Scanner sc = new Scanner(System.in);			int n= sc.nextInt();			int dexA = -1;			int dexB = -1;			int count = 0;			boolean hit = false;			int temp = sc.nextInt();			int[] arr = new int[n];			arr[0] = temp;			for(int i = 1;i<n;i++)			{				int num = sc.nextInt();				arr[i] = num;				if(temp>=num)				{					if(!hit)					{						count++;						dexA = i-1;						hit = true;					}									}				else				{					if(hit)					{						hit = false;						dexB = i-1;					}				} 				temp = num;				 			}			if(dexB == -1)				dexB=n-1;			if(count==0)			{				System.out.println("yes");				System.out.println(1+" "+1);			}			else			{				if(count>1)				{					System.out.println("no");				}				else				{					Arrays.sort(arr,dexA,dexB+1);					boolean k = false;					for(int i = 0;i<n-1;i++)					{						if(arr[i]>arr[i+1])						{							System.out.println("no");							k = true;							break;						}					}					if(!k)					{						System.out.println("yes");						dexA++;						dexB++;						System.out.println(dexA+" "+dexB);					}				}			}								}}	