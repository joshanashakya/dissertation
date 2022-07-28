import java.io.*;import java.util.Arrays;import java.util.StringTokenizer; public class Kayaking { 	public static void main(String[] args) throws Exception{		// TODO Auto-generated method stub		boolean sent = true;		FastIO f = new FastIO(System.in);		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));		int n = f.nextInt();		int[] arr = new int[2 * n];		for(int i = 0; i < 2 * n; i++) {			arr[i] = f.nextInt();		}		Arrays.parallelSort(arr);		int min = Integer.MAX_VALUE;		for(int i = 0; i < 2 * n - 1; i++) {			for(int k = i + 1; k < 2 * n; k++) {				int x = -1;				int num = 0;				for(int p = 0; p < 2 * n; p++) {					if(p == i || p == k) continue;					num += x * arr[p];					x *= -1;				}				min = Math.min(min, num);			}		}		out.println(min);		out.close();	}		static class FastIO {         InputStream dis;        byte[] buffer = new byte[1 << 17];        int pointer = 0;         public FastIO(String fileName) throws Exception {            dis = new FileInputStream(fileName);        }         public FastIO(InputStream is) throws Exception {            dis = is;        }         int nextInt() throws Exception {            int ret = 0;             byte b;            do {                b = nextByte();            } while (b <= ' ');            boolean negative = false;            if (b == '-') {                negative = true;                b = nextByte();            }            while (b >= '0' && b <= '9') {                ret = 10 * ret + b - '0';                b = nextByte();            }             return (negative) ? -ret : ret;        }         long nextLong() throws Exception {            long ret = 0;             byte b;            do {                b = nextByte();            } while (b <= ' ');            boolean negative = false;            if (b == '-') {                negative = true;                b = nextByte();            }            while (b >= '0' && b <= '9') {                ret = 10 * ret + b - '0';                b = nextByte();            }             return (negative) ? -ret : ret;        }         byte nextByte() throws Exception {            if (pointer == buffer.length) {                dis.read(buffer, 0, buffer.length);                pointer = 0;            }            return buffer[pointer++];        }         String next() throws Exception {            StringBuffer ret = new StringBuffer();             byte b;            do {                b = nextByte();            } while (b <= ' ');            while (b > ' ') {                ret.appendCodePoint(b);                b = nextByte();            }             return ret.toString();        }     } }
