import java.util.*;public class Antonandcurrenceyouallknow { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc= new Scanner(System.in); 		String s=sc.next();		int l=s.charAt(s.length()-1)-'0';//		System.out.println(l);		int h=-1;		for(int i=0;i<s.length();i++)		{			if((s.charAt(i)-'0')%2==0)			{				if(s.charAt(i)-'0'<l)				{					h=i; break;				}				else					h=i;			}		}		if(h==-1)			System.out.println(-1);		else			System.out.println(s.substring(0,h)+s.substring(s.length()-1)+s.substring(h+1,s.length()-1)+s.substring(h,h+1));			} }