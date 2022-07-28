import java.util.*;

public class Q1{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			int k = in.nextInt();
			int st = (int)Math.ceil((double)k / 2);
			int size = n - st;
			System.out.println(size);
			for (int i = st; i <= n; i++){
				if(i != k)
					System.out.print(i + " ");
			}
			if(size > 0)
				System.out.println();
		}
	}
}
