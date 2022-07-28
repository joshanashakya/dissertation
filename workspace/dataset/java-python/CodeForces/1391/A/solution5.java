import java.util.*;
public class Main{
	
	static Scanner in = new Scanner(System.in);
	static int N = 110;
	public static void main(String[] args) {
		int t = in.nextInt();
		while(t -- > 0) {
			int n = in.nextInt();
			for(int i = n ; i >= 1 ;i --)System.out.print(i+" ");
			System.out.println();
		}
	}
}
