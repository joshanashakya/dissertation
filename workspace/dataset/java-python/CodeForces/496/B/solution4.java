import java.io.BufferedReader;import java.io.BufferedWriter;import java.io.File;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.FileWriter;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.lang.reflect.Array;import java.text.ParseException;import java.text.SimpleDateFormat;import java.util.Date;import java.util.Deque;import java.io.ObjectInputStream.GetField;import java.io.OutputStreamWriter;import java.util.ArrayDeque;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Comparator;import java.util.HashMap;import java.util.HashSet;import java.util.LinkedList;import java.util.List;import java.util.Map;import java.util.Scanner;import java.util.Set;import java.util.StringTokenizer;import java.util.TimeZone;import java.util.TreeMap;import java.text.*; public class Main {	static String min;	static char arr[]; 	public static void main(String[] args) throws IOException {		FastReader in = new FastReader();		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));		in.nextInt();		min = in.next();		arr = min.toCharArray();		for (int i = 1; i <= 10; i++) { 			for (int j = 0; j < arr.length; j++)				arr[j] = (arr[j] == '9') ? '0' : (char) (arr[j] + 1);			for (int k = 0; k < arr.length; k++)				reverse(k); 		}		out.write(min + "\n");		out.close(); 	} 	private static void reverse(int k) {		String array = String.valueOf(arr);		String res = array.substring(arr.length - k) + array.substring(0, arr.length - k);		if (res.compareTo(min) < 0)			min = res; 	}} class FastReader {	BufferedReader br;	StringTokenizer st; 	public FastReader() {		br = new BufferedReader(new InputStreamReader(System.in)); 	} 	public FastReader(File f) throws FileNotFoundException {		br = new BufferedReader(new FileReader(f));	} 	String next() {		while (st == null || !st.hasMoreElements()) {			try {				st = new StringTokenizer(br.readLine()); 			} catch (IOException e) {				e.printStackTrace();			} 		} 		return st.nextToken(); 	} 	int nextInt() { 		return Integer.parseInt(next());	} 	double nextDouble() { 		return Double.parseDouble(next());	} 	long nextLong() { 		return Long.parseLong(next());	} 	String nextLine() {		String str = "";		try {			str = br.readLine(); 		} catch (IOException e) { 			e.printStackTrace();		}		return str; 	} 	boolean ready() throws IOException {		return br.ready();	}}