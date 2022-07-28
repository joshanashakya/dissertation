import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Practice {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while ((t--) > 0) {
			PriorityQueue<Integer> heap=new PriorityQueue<Integer>(Collections.reverseOrder());
			String str = (br.readLine());
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='1') {
					int curr=0;
					
					while(i<str.length() && str.charAt(i)=='1') {
						i++;
						curr++;
					}
					
					heap.add(curr);
				}
			}int ans=0;
			while(!heap.isEmpty()) {
				ans+=heap.remove();
				if(heap.size()>0) {
					heap.remove();
				}
			}System.out.println(ans);
		}
	}

}
