import java.util.*;import java.math.*;public class PoloPenguin{	public static void main(String[] args)		{			Scanner sc = new Scanner(System.in);			int n = sc.nextInt();			int k = sc.nextInt();			int out = 0;			while(n-->0)			{				int l = sc.nextInt();				int r = sc.nextInt();				out+=r-l+1;			}			if(out<=k)				System.out.println(k-out);			else			{				int num = (int)Math.ceil((double)out/(double)k);				k*=num;				System.out.println(k-out);			}		}}