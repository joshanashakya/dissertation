import java.util.*;import java.math.*;public class Inflation{	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int runs = sc.nextInt();		while(runs-->0)		{			int n = sc.nextInt();			double k = sc.nextDouble();			long out = 0;			double divisor = 0;			for(int i = 0;i<n;i++)			{				double temp = sc.nextDouble();				if(i==0)				{					divisor = temp;				}				else				{					if(temp/divisor>(k/100.0))					{						long num = (long)Math.ceil(((temp*100)/(k))-divisor);						//System.out.println(num);						divisor+=(num+temp);						out+=num;					}					else					{						divisor+=temp;					}				}			}			System.out.println(out);		}	}}
