import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer; public class CF0174B_FileList {	static class Scanner {		BufferedReader br;		StringTokenizer st; 		public Scanner() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		} 	} 	static void print(Object b) {		System.out.print(b);	} 	static void println(Object b) {		System.out.println(b);	} 	static void println() {		System.out.println();	} 	static ArrayList<String> solution(String s) { 		int last = -1;		ArrayList<String> arr = new ArrayList<String>();		for (int i = 0; i < s.length(); i++) {			if (s.charAt(i) == '.') {				if (last != -1 && i - (last + 1) < 2)					return null;				if (last == -1 && i - (last + 1) < 1)					return null;				if (last != -1 && i - (last + 1) > 11)					return null;				if (last == -1 && i - (last + 1) > 8)					return null;				arr.add(s.substring(last + 1, i)); 				last = i;			}		} 		if (arr.size() == 0)			return null; 		if (s.length() - (last + 1) < 1)			return null;		if (s.length() - (last + 1) > 3)			return null;		arr.add(s.substring(last + 1, s.length())); 		ArrayList<String> ans = new ArrayList<String>();		ans.add(arr.get(0));		for (int i = 1; i < arr.size() - 1; i++) {			if (arr.get(i).length() > 3) {				ans.set(i - 1, ans.get(i - 1) + "." + arr.get(i).substring(0, 3));				ans.add(arr.get(i).substring(3));			} else {				ans.set(i - 1, ans.get(i - 1) + '.' + arr.get(i).substring(0, 1));				ans.add(arr.get(i).substring(1));			}		}		ans.set(ans.size() - 1, ans.get(ans.size() - 1) + '.' + arr.get(ans.size())); 		return ans;	} 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner scanner = new Scanner();		String s = scanner.next();		ArrayList<String> ans = solution(s);		if (ans == null)			println("NO");		else {			println("YES");			for (int i = 0; i < ans.size(); i++)				println(ans.get(i));		}	} }