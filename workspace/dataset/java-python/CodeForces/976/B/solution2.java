import java.io.*; public class Main {    static long n, m, k;    static String[] input;    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));     public static void main(String[] args) throws IOException {        input = br.readLine().split(" ");        n = Integer.parseInt(input[0]);        m = Integer.parseInt(input[1]);        k = Long.parseLong(input[2]);        if (k < n) {            bw.write(k + 1 + " " + 1);        } else {            long x = n - (k - n) / (m - 1), y = (k - n) % (m - 1);            y = (x & 1) == 1 ? m - y : 2 + y;            bw.write(x + " " + y);        }        bw.close();    }}
