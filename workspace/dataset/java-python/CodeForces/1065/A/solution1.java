import java.util.Scanner; public class problem40 { 	public static void main(String[] args) {		// TODO Auto-generated method stub				Scanner sc = new Scanner(System.in);		int t = sc.nextInt();		while(t!=0)		{			long s = sc.nextLong();//intila money			long a = sc.nextLong();//min choc to be brought			long b= sc.nextLong();//no of fre choc			long c = sc.nextLong();//cost of each			long buyinitial = s/c;			if(buyinitial>=a)			{				long free = (buyinitial/a)*b;				System.out.println(free+buyinitial);			}			else			{				System.out.println(buyinitial);			}						t--;		} 	} }