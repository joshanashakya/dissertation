import java.io.*;import java.util.*;public class Main {	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));	public static void main(String[] args) throws Exception {		int t = Integer.parseInt(in.readLine());		while(t--!=0) {			int len = Integer.parseInt(in.readLine());			String s1 = in.readLine();			String s2 = in.readLine();			if(s1.equals(s2)) out.println("EQUAL");			else deal(s1,s2);		}		out.flush();	}	static void deal(String s1, String s2) {		int n1 = 0, n2 = 0;		for(int i=0;i<s1.length();i++) {			if(s1.charAt(i)>s2.charAt(i)) n1++;			if(s1.charAt(i)<s2.charAt(i)) n2++;		}		if(n1>n2) out.println("RED");		else if(n1<n2) out.println("BLUE");		else out.println("EQUAL");	}}
