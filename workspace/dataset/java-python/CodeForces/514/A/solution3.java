import java.util.*;import java.io.*; public class Chewbacca {    public static void main(String[] args) {        FastReader reader = new FastReader();         String num = reader.nextLine();        String f = "";        /*         * for (int i = 0; i < s.length(); i++) { if (9 -         * Character.getNumericValue(s.charAt(i)) >=         * Character.getNumericValue(s.charAt(i))) { f +=         * String.valueOf(Character.getNumericValue(s.charAt(i))); } else { f +=         * String.valueOf(9 - Character.getNumericValue(s.charAt(i))); } }         * System.out.println(f);         */        for (int i = 0; i < num.length(); ++i) {            if (i == 0) {                if ('5' <= num.charAt(0) && num.charAt(0) <= '8')                    System.out.print((char) ('0' + 9 - num.charAt(0) + '0'));                else                    System.out.print(num.charAt(0));            } else {                if ('5' <= num.charAt(i) && num.charAt(i) <= '9')                    System.out.print((char) ('0' + 9 - num.charAt(i) + '0'));                else                    System.out.print(num.charAt(i));            }        }    }     static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }} 