import java.util.*;import java.io.*; public class AmityAssessment {	static BufferedReader br;	static StringTokenizer tokenizer; 	public static void main(String[] args) throws Exception {		br = new BufferedReader(new InputStreamReader(System.in));		String s = "";		String s1 = "";		s += next();		String t = next();		s += t.charAt(1) + "" + t.charAt(0);		s1 += next();		t = next();		s1 += t.charAt(1) + "" + t.charAt(0);		s = removeX(s);		s1 = removeX(s1);		int start = 0;		int start2 = 0;//		System.out.println(s);//		System.out.println(s1);		for(int i = 0; i < 3; i++)			if(s.charAt(i) == 'A')				start = i;		for(int i = 0; i < 3; i++)			if(s1.charAt(i) == 'A')				start2 = i;		for(int i = 1;  i< 3; i++) {			if(s.charAt((start + i) % 3) != s1.charAt((start2 + i) % 3)) {				System.out.println("NO");				return;			}		}		System.out.println("YES");	}	public static String removeX(String s) {		for(int i = 0; i < s.length(); i++)			if(s.charAt(i) == 'X')				return s.substring(0, i) + s.substring(i + 1);		return null;	} 	public static String next() throws IOException {		while (tokenizer == null || !tokenizer.hasMoreTokens()) {			String line = br.readLine();			if (line == null)				throw new IOException();			tokenizer = new StringTokenizer(line);		}		return tokenizer.nextToken();	} 	public static int nextInt() throws IOException {		return Integer.parseInt(next());	}}
