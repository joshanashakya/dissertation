/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */ import java.util.*;import java.io.*; public class NewMain_123 {     public static void main(String[] args) {        // TODO code application logic here        FastReader s = new FastReader();        String a = s.next();         String b = s.next();         String c = s.next();         String x = "C,C#,D,D#,E,F,F#,G,G#,A,B,H,C,C#,D,D#,E,F,F#,G,G#,A,B,H";        String[] q = x.split(",");        int[] f = new int[6];        int n = 0;        for (int i = 0; i < q.length; i++) {            if (q[i].equals(a)) {                f[n++] = i + 1;             }            if (q[i].equals(b)) {                f[n++] = i + 1;            }            if (q[i].equals(c)) {                f[n++] = i + 1;            }         }         for (int i = 0; i < 4; i++) {            int n1 = f[i];            int n2 = f[i + 1];            int n3 = f[i + 2];             if (n2 - n1 == 4 && n3 - n2 == 3) {                System.out.println("major");                return;            } else if (n2 - n1 == 3 && n3 - n2 == 4) {                System.out.println("minor");                return;            }        }         System.out.println("strange");    }     static class FastReader {         BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return str;        }    }}
