import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Digit_Seq {    static class FastReader {        BufferedReader br;        StringTokenizer st;        public FastReader(){            br = new BufferedReader(new InputStreamReader(System.in));        }        String next(){            while(st==null || !st.hasMoreElements()){                try{                    st = new StringTokenizer(br.readLine());                }catch (IOException e){                    e.printStackTrace();                }            }            return st.nextToken();        }        int nextInt(){            return Integer.parseInt(next());        }        long nextLong(){            return Long.parseLong(next());        }        String nextLine(){            String str = "";            try            {                str = br.readLine();            }catch (IOException e){                e.printStackTrace();            }            return str;        }        double nextDouble(){            return Double.parseDouble(next());        }    }    public static void main(String[] args) {        FastReader in = new FastReader();        int k = in.nextInt();        long n = 1;        int i = 0;        String s = "";        while(s.length() < k){            s += n;            n++;        }        System.out.println(s.charAt(k-1));    }}
