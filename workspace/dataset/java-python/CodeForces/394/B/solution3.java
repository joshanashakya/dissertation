import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.Arrays;import java.util.StringTokenizer; /** * Created by yujiahao on 4/21/17. */public class cf_231_b {    private FastScanner in;    private PrintWriter out;     public void solve() throws IOException {        int p = in.nextInt();        int x = in.nextInt();        if (p==1){            if (x==1){                out.println("1");                return;            }            out.println("Impossible");            return;        }         int[] res = new int[p];        Arrays.fill(res, 9);        boolean find = false;         for (int i=1; i<=9; i++){            int[] nums = new int[p];            if (valid(p, x, i, nums)){                find = true;                res = larger(res, nums);            }        }         if (find){            out.println(toString(res));            return;        }        out.println("Impossible");    }     int[] larger (int[] res, int[] nums){        for (int i=0; i<nums.length; i++){            if (res[i] < nums[i])   return res;            else if (res[i] > nums[i])  return nums;        }        return res;    }     boolean valid(int p, int x, int end, int[] nums){        nums[p-1] = end;         int carry = 0;        int calc = end * x;         nums[p-2] = calc%10;        carry = calc/10;         for (int i=p-2; i>=1; i--){            int next = nums[i] * x + carry;             nums[i-1] = next%10;            carry = next/10;        }         if (nums[0] == 0)   return false;        if (nums[0] * x + carry == end) return true;         return false;    }      String toString(int[] nums){        StringBuilder sb = new StringBuilder();        for (int i=0; i<nums.length; i++)   sb.append(nums[i]);        return sb.toString();    }      public void run() {        try {            in = new FastScanner();            out = new PrintWriter(System.out);            solve();            out.close();        } catch (IOException e) {            e.printStackTrace();        }    }     private class FastScanner {        private BufferedReader br;        private StringTokenizer st;         public FastScanner() {            br = new BufferedReader(new InputStreamReader(System.in));        }         public String next() {            while (st == null || !st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public double nextDouble() {            return Double.parseDouble(next());        }         public BigInteger nextBigInteger() { return new BigInteger(next());}     }     public static void main(String[] arg) {        new cf_231_b().run();    }}