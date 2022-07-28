import java.util.*;
import java.math.*;
public class CatCycle
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int runs = sc.nextInt();
			while(runs-->0)
			{
				int n = sc.nextInt();
				int k = sc.nextInt()-1;
				int f = n/2;
				int out = (k + (n % 2) * k / f) % n + 1;
				System.out.println(out);
			}
		}
}
