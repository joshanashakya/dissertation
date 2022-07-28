import java.util.*;
 
public class CodeForces1487B{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i = 0;i<t;i++){
			int n = input.nextInt();
			int k = input.nextInt()-1;
			if(n%2 == 0){
				System.out.println((k%n)+1);
			}
			else{
				int m = k/(n/2);
				System.out.println((k+m)%n + 1);
			}
		}
	}
}

