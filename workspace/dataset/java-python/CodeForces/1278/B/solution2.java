import java.io.BufferedReader;import java.io.InputStreamReader; public class AandB {		public static void main(String[] args) throws Exception {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		int t = Integer.parseInt(br.readLine());		while (t-- > 0) {			String[] inp = br.readLine().split(" ");			long a = Long.parseLong(inp[0]);			long b = Long.parseLong(inp[1]);			if (b > a) {				long tmp = b;				b = a;				a = tmp;			}			long diff = a - b;			int i = 0;			while (true) {				long val = i * (i + 1);				if (val >= 2 * diff && ((val / 2) - diff) % 2 == 0) {					break;				}				i++;			}			System.out.println(i);		}	}	}