 /*ID: grifync1LANG: JAVAPROG: obfuscation*/ //lil lil peezyimport java.util.*;import java.io.*; public class obfuscation {	public static int conv(String s) {		return Integer.parseInt(s);	} 	public static int max(int a, int b) {		return Math.max(a, b);	} 	public static int min(int a, int b) {		return Math.min(a, b);	} 	public static void print(int num) {		System.out.println(num);	} 	public static void prints(String s) {		System.out.println(s);	} 	public static void printa(int[] a) {		for (int i = 0; i < a.length; i++) {			if (i == 0) {				System.out.print(a[i]);			} else {				System.out.print(" " + a[i]);			}		}	} 	public static int[] sort(int[] nums) {		Arrays.sort(nums);		return nums;	} 	public static void main(String[] args) throws IOException {		//BufferedReader in = new BufferedReader(new FileReader("obfuscation.in"));		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("obfuscation.out")));		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		PrintWriter out = new PrintWriter(System.out);		//StringTokenizer st = new StringTokenizer(in.readLine());		String s = in.readLine();		char first = 'a';		boolean ok = false;		for(int i=0; i<s.length(); i++) {			if(first==s.charAt(i)) {				first++;				}			if(first < s.charAt(i)) {				out.println("NO");				ok=true;				break;			}		}		if(!ok) {			out.println("YES");		}		in.close();		out.close();	} }