import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class A293 {    public static void main(String[] args) throws IOException {        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        int n = Integer.parseInt(in.readLine());        StringBuffer s = new StringBuffer(in.readLine());        StringBuffer t = new StringBuffer(in.readLine());        int[] w = new int[2 * n];        int sc = 0;        int tc = 0;        boolean isFirst = true;        int delete = 0;        int both = 0;        int sf = 0;        int tf = 0;         for (int i = 0; i < n * 2; i++) {            if (s.charAt(i) == '1' && t.charAt(i) == '1') {                both++;            } else if (s.charAt(i) == '1' && t.charAt(i) == '0') {                sf++;            } else if (s.charAt(i) == '0' && t.charAt(i) == '1') {                tf++;            }        }         if (both > 0) {            if (both % 2 == 0) {                sc = both / 2;                tc = both / 2;            } else {                sc = (both - 1) / 2 + 1;                tc = (both - 1) / 2;                isFirst = false;            }        }         while (sf > 0 || tf > 0) {            if (isFirst) {                if (sf > 0) {                    sc++;                    sf--;                } else {                    tf--;                }            } else {                if (tf > 0) {                    tc++;                    tf--;                } else {                    sf--;                }            }            isFirst = !isFirst;        }         /*if (Math.abs(sc - tc) > 2) {            int dif = Math.abs(sc - tc);            if (dif % 2 == 0) {                if (sc - tc > 0) {                    sc -= dif / 2;                    tc += dif / 2;                } else {                    sc += dif / 2;                    tc -= dif / 2;                }            } else {                if (sc - tc > 0) {                    sc -= (dif / 2) - 0.5;                    tc += (dif / 2) + 0.5;                } else {                    tc -= (dif / 2) - 0.5;                    sc += (dif / 2) + 0.5;                }            }        }*/          if (sc > tc) {            System.out.println("First");        } else if (sc < tc) {            System.out.println("Second");        } else {            System.out.println("Draw");        }     }}
