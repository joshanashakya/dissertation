import java.util.*;import java.util.stream.*; public class Solution {	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		int n = scan.nextInt();		int k = scan.nextInt();		List<Integer> a = new ArrayList<>();		for(int i = 0; i < n; i++) {			a.add(scan.nextInt());		}		Collections.sort(a);		String result = (n < k) ? "-1" : a.get(n-k) + " " + a.get(n-k);		System.out.println(result);	}	}
