import java.util.*;import java.math.*;public class BerlandCrossword{	public static void main(String[] args)		{			Scanner sc = new Scanner(System.in);			int runs = sc.nextInt();			while(runs-->0)			{				int n = sc.nextInt();				boolean works = true;				int[] hold = new int[4];				int[] arr = new int[4];				for(int i= 0;i<4;i++)				{					arr[i] = sc.nextInt();					hold[i] = arr[i];				}				//System.out.println(arr[3]+"-");				if(hold[0]==n)				{					arr[1]--;					arr[3]--;				}				if(hold[2]==n)				{					arr[1]--;					arr[3]--;				}				if(hold[1]==n)				{					arr[0]--;					arr[2]--;				}				if(hold[3]==n)				{					arr[0]--;					arr[2]--;				}				if(hold[0]==n-1)				{					if(arr[1]>arr[3])						arr[1]--;					else						arr[3]--;				}				if(hold[2]==n-1)				{					if(arr[1]>arr[3])						arr[1]--;					else						arr[3]--;				}				if(hold[1]==n-1)				{					if(arr[0]>arr[2])						arr[0]--;					else						arr[2]--;				}				if(hold[3]==n-1)				{					if(arr[0]>arr[2])						arr[0]--;					else						arr[2]--;				}				for(int i = 0;i<4;i++)				{					if(arr[i]<0)						works = false;					//System.out.println(arr[i]);				}				System.out.println(works?"YES":"NO");			}		}}