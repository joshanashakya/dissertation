import java.util.*;import java.util.stream.*; public class Solution {	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		int k = scan.nextInt();		scan.nextLine();		Map<Integer, Integer> count = new HashMap<>();		String result = "YES";		for(int i = 0; i < 4; i++) {			String s = scan.nextLine();			for(int j = 0; j < 4; j++) {				char ch = s.charAt(j);				if(ch == '.') continue;				int num = Integer.parseInt(String.valueOf(ch));				if(!count.containsKey(num)) {					count.put(num, 0);				}				int c = count.get(num);				if(c == 2*k) {					result = "NO";					break;				} else {					count.put(num, c+1);				}			}		}		System.out.println(result);	}}