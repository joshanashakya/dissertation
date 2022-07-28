import java.util.*;

public class CodeForces1496B{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int j= 0;j<t;j++){
			int n = input.nextInt();
			int k = input.nextInt();
			Set<Integer> set = new HashSet<>();
			int max = 0;
			for(int i = 0;i<n;i++){
				int c = input.nextInt();
				set.add(c);
				max = Math.max(max,c);
			}
			if(k == 0){
				System.out.println(set.size());
				continue;
			}
			int min = 0;
			while(set.contains(min)){
				min++;
			}
			if(min < max){
				int count = (max+min+1)/2;
				set.add(count);
				System.out.println(set.size());
			}
			else{
				System.out.println(set.size() + k);
			}
			
		}
	}
}
