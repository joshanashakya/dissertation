import java.util.*;import java.math.*;public class RandomTeams{	public static void main(String[] args)		{			Scanner sc = new Scanner(System.in);			long n = sc.nextLong();			long m = sc.nextLong();			long max = n-(m-1);			max = max*(max-1)/2;			long x = n/m, y = n%m;			long min = 0;			min+=(m-y)*x*(x-1)/2;			x++;			min+=y*x*(x-1)/2;			System.out.println(min+" "+max);		}}
