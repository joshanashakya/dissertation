import java.util.*;import java.math.*;public class DisturbedPeople{	public static void main(String[] args)		{			Scanner sc = new Scanner(System.in);			int size = sc.nextInt();			int dist = 0;			int[] arr = new int[size];			for(int i= 0;i<size;i++)				arr[i] = sc.nextInt();			for(int i = 1;i<size;i++)			{				if(i+1>=size)					break;				if(arr[i] == 0&&arr[i-1]==1&&arr[i+1]==1)				{					i+=2;					dist++;				}			}			System.out.println(dist);		}}
