/*ID: grifync1LANG: JAVAPROG: vicious*/ //lil lil peezyimport java.util.*;import java.io.*; public class vicious {	public static int conv(String s) {		return Integer.parseInt(s);	} 	public static int max(int a, int b) {		return Math.max(a, b);	} 	public static int min(int a, int b) {		return Math.min(a, b);	} 	public static void print(int num) {		System.out.println(num);	} 	public static void prints(String s) {		System.out.println(s);	} 	public static void printa(int[] a) {		for (int i = 0; i < a.length; i++) {			if (i == 0) {				System.out.print(a[i]);			} else {				System.out.print(" " + a[i]);			}		}	} 	public static int[] sort(int[] nums) {		Arrays.sort(nums);		return nums;	} 	public static void main(String[] args) throws IOException {		//BufferedReader in = new BufferedReader(new FileReader("vicious.in"));		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("vicious.out")));		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		PrintWriter out = new PrintWriter(System.out);		//StringTokenizer st = new StringTokenizer(in.readLine());		String s = "K"+in.readLine()+"V";		List<String> allsubs = new ArrayList<String>();		for(int i=1; i<=s.length(); i++) {			for(int j=0; j<=s.length()-i; j++) {				int mid = i+j-1;				StringBuilder sb = new StringBuilder();				for(int z=j; z<=mid; z++) {					sb.append(s.charAt(z)+"");				}				allsubs.add(sb.toString());			}		}		if(s.length()==2) {			out.println(1);		}		else {			int vks = 0;			for(String a: allsubs) {				if(a.equals("VK")) {					vks++;				}			}						if(allsubs.contains("VVV") || allsubs.contains("KKK")) {				out.println(vks+1);			}			else {				out.println(vks);			}		}		in.close();		out.close();	} }
