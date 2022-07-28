import java.util.*;

public class question {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int l=0; l<t; l++) {
			int n = sc.nextInt();
			HashMap<Character, Integer> h = new HashMap<>();
			int count=0, e=0;
			for(int k=0; k<n; k++) {
				String s = sc.next();
				for(int i=0; i<s.length(); i++) {
					char ch = s.charAt(i);
					if(!h.containsKey(ch)) h.put(ch, 1);
					else {
						int v = h.get(ch) + 1;
						h.put(ch, v);
					}
				}
			}

			for(char ch : h.keySet()) {
				if( h.get(ch) %n== 0 )  count++;
				else {
					e++;
					System.out.println("NO"); break;
				}
			}
			if(e==0) System.out.println("YES");
		}
			
			
	}
}		
		  


