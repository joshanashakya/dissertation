import java.util.Scanner; public class sixteen { 	public static void main(String[] args) {		// TODO Auto-generated method stub				Scanner sc = new Scanner (System.in);		String n  =sc.nextLine();		String s1 = sc.nextLine();		String s2 = sc.nextLine();		int x=0;	//	System.out.println("ndibfew"+s1);	//	System.out.println(s1+"    "+s2);		for(int i=0;i<s1.length();i++)		{			char ch1 = s1.charAt(i);						char ch2 = s2.charAt(i);		//	System.out.println(ch1);		//	System.out.println(ch2);			if(ch1!=ch2)			{  				int y =  Math.abs((int)ch1-(int)ch2);				if(y>5)				{					x = x+(10-y);				}				else					x =x+y;				 			//	 System.out.println(x);			}					}		System.out.println(x);				 	} }
