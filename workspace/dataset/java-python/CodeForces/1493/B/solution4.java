import java.util.*;import java.math.*;public class SortTheArray{	public static void main(String[] args)		{			Scanner sc = new Scanner(System.in);			int runs = sc.nextInt();			while(runs-->0)			{				int h = sc.nextInt();				int m = sc.nextInt();				String[] in = sc.next().split(":");				int hour = Integer.parseInt(in[0]);				int minute = Integer.parseInt(in[1]);				while(true)				{					if(works(h,m,hour,minute))						break;					minute++;					if(minute==m)					{						minute=0;						hour++;					}					if(hour==h)						hour=0;				}				if(hour<10)					System.out.print("0"+hour);				else					System.out.print(hour);				System.out.print(":");				if(minute<10)					System.out.print("0"+minute);				else					System.out.print(minute);				System.out.println();				//System.out.println(hour+":"+minute);			}					}		public static boolean works(int h,int m,int hour,int minute)		{			int a = swap(hour/10);			if(a==-1)				return false;			int b = swap(hour % 10);			if (b == -1) return false;			int c = swap(minute / 10);			if (c == -1) return false;			int d = swap(minute % 10);			if (d == -1) return false;			if (10 * d + c >= h) return false;			if (10 * b + a >= m) return false;			return true;		}		public static int swap(int x)			{			if(x==0)				return 0;			if(x==1)				return 1;			if(x==2)				return 5;			if(x==5)				return 2;			if(x==8)				return 8;			return -1; 		}}
