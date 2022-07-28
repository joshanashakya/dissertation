import java.io.BufferedOutputStream;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.Arrays;import java.util.StringTokenizer; public class applemanandtoastman { 	public static void main(String[] args) throws Exception {		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out)); 		int n = Integer.parseInt(in.readLine());				Long[] nums = new Long[n];				StringTokenizer st = new StringTokenizer(in.readLine());		for (int i = 0; i < n; i++) {			long num = Integer.parseInt(st.nextToken());			nums[i] = num;		}				Arrays.parallelSort(nums);				long res = 0;				for (int i = 1; i < n; i++) {			res += (i + 1) * nums[i-1];		}		res += n * nums[n-1];				out.println(res);				in.close();		out.close();	}	}