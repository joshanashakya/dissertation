import java.io.BufferedOutputStream;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Collections;import java.util.StringTokenizer; public class beautifulpaintings { 	public static void main(String[] args) throws Exception {		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out)); 		int n = Integer.parseInt(in.readLine());				StringTokenizer st = new StringTokenizer(in.readLine());				ArrayList<Integer> nums = new ArrayList<Integer>();		for (int i = 0; i < n; i++) {			int num = Integer.parseInt(st.nextToken());			nums.add(num);		}				Collections.sort(nums);				int last = nums.remove(0);		int count = 0;		for (int i = 1; i < n; i++) {			int next = -1;			for (int j = 0; j < nums.size(); j++) {				if(nums.get(j) > last) {					next = j;					break;				}			}			if(next != -1) {				last = nums.remove(next);				count++;			} else {				last = nums.remove(0);			}		}				out.println(count);				in.close();		out.close();	}	}