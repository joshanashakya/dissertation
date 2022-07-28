import java.io.FileInputStream;import java.io.InputStream;import java.util.*;  public class powersoftwo { 	public static void main(String[] args) throws Exception{		FastIO sc = new FastIO(System.in);		int N = sc.nextInt();		TreeSet<Integer> powersOfTwo = new TreeSet<Integer>();		int val = 1;		for (int i = 0;i<31;i++) {			powersOfTwo.add(val);			val*=2;		}		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();		int[] arr = new int[N];		long pairs = 0;		for (int i =0;i<N;i++) {			int a = sc.nextInt();						Iterator<Integer> iter = powersOfTwo.tailSet(a).iterator();			while(iter.hasNext()) {				int pow = iter.next();				if (hmap.containsKey(pow-a)) {					//System.out.println(a+" "+(pow)+" "+hmap.get(pow-a));					pairs += (long)hmap.get(pow-a);				}			}			if (!hmap.containsKey(a)) {				hmap.put(a,0);			}			arr[i] = a;			hmap.replace(a, hmap.get(a)+1);		}		System.out.println(pairs);	}		static class FastIO {         InputStream dis;        byte[] buffer = new byte[1 << 17];        int pointer = 0;         public FastIO(String fileName) throws Exception {            dis = new FileInputStream(fileName);        }         public FastIO(InputStream is) throws Exception {            dis = is;        }         int nextInt() throws Exception {            int ret = 0;             byte b;            do {                b = nextByte();            } while (b <= ' ');            boolean negative = false;            if (b == '-') {                negative = true;                b = nextByte();            }            while (b >= '0' && b <= '9') {                ret = 10 * ret + b - '0';                b = nextByte();            }             return (negative) ? -ret : ret;        }         long nextLong() throws Exception {            long ret = 0;             byte b;            do {                b = nextByte();            } while (b <= ' ');            boolean negative = false;            if (b == '-') {                negative = true;                b = nextByte();            }            while (b >= '0' && b <= '9') {                ret = 10 * ret + b - '0';                b = nextByte();            }             return (negative) ? -ret : ret;        }         byte nextByte() throws Exception {            if (pointer == buffer.length) {                dis.read(buffer, 0, buffer.length);                pointer = 0;            }            return buffer[pointer++];        }         String next() throws Exception {            StringBuffer ret = new StringBuffer();             byte b;            do {                b = nextByte();            } while (b <= ' ');            while (b > ' ') {                ret.appendCodePoint(b);                b = nextByte();            }             return ret.toString();        }     } }