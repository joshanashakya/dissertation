import java.util.*;public class Bar { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc=new Scanner(System.in);		int t=sc.nextInt();		int c=0;		while(t-->0)		{			String s= sc.next();			if(s.charAt(0)>='0'&& s.charAt(0)<='9')			{				if(Integer.valueOf(s)<18)					c++;			}			if((s.equals("ABSINTH"))||(s.equals("BEER"))||(s.equals("BRANDY"))||(s.equals("CHAMPAGNE"))||(s.equals("GIN"))||(s.equals("RUM"))||(s.equals("SAKE"))||(s.equals("TEQUILA"))||(s.equals("VODKA"))||(s.equals("WHISKEY"))||(s.equals("WINE")))				c++; 		}		System.out.println(c);	} }