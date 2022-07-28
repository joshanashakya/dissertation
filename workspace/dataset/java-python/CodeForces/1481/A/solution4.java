import java.util.*;

public class CodeForces1481A{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int j = 0;j<t;j++){
			int px = input.nextInt();
			int py = input.nextInt();
			String s = input.next();
			char x = 'L';
			char y = 'D';
			if(px > 0){
				x = 'R';
			}

			if(py > 0){
				y = 'U';
			}

			int count_x = 0;
			int count_y = 0;
			for(int i = 0;i<s.length();i++){
				if(s.charAt(i) == x){
					count_x++;
				}
				else if(s.charAt(i) == y){
					count_y++;
				}
			}

			if(count_x >= Math.abs(px) && count_y >= Math.abs(py)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		}
	}
}
