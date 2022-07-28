import java.util.*;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			int t=sc.nextInt();
			while(t-->0)
			{
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(2 * x > y ? ((-1) + " " + (-1)) : (x + " " + x * 2));
			}
		}
	}

}
