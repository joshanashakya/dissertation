
import java.util.*;
public class ApplejackStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[100001];
		int[]freq=new int[100001];
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			arr[num]++;
			freq[arr[num]]++;
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			String s = sc.next();
			int x = sc.nextInt();
			if(s.equals("+")) {
				arr[x]++;
				freq[arr[x]]++;
			}else {
				freq[arr[x]]--;
				arr[x]--;
			}
			if(freq[8]>0 || (freq[6]>0 && freq[2]>1) || (freq[4]>1) || (freq[4]>0 && freq[2]>2)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}

}

