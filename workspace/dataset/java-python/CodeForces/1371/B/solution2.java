import java.math.*;import java.util.*;public class MagicalCalender{	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int runs = sc.nextInt();		while(runs-->0)		{			long n= sc.nextLong();			long r = sc.nextLong();			long out = 1;			if(r<n)				out = r*(r+1)/2;			else			{				out = n*(n-1)/2+1;			}			System.out.println(out);		}	}}
