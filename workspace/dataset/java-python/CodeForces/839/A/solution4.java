import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class Problem428A {    public static void main(String[] args) throws Exception {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        PrintWriter writer = new PrintWriter(System.out);         StringTokenizer info = new StringTokenizer(reader.readLine());        int n = Integer.parseInt(info.nextToken());        int k = Integer.parseInt(info.nextToken());          int sum = 0;        StringTokenizer aT = new StringTokenizer(reader.readLine());        int[] a = new int[n];        int count = 0;        for (int i = 0; i < n; i++) {            a[i] = Integer.parseInt(aT.nextToken());            sum += a[i];            int out = Math.min(sum, 8);            k -= out;            sum -= out;            count++;            if (k <= 0) {                break;            }        }        if (k > 0) {            writer.println("-1");        } else {            writer.println(count);        }          reader.close();        writer.close();    }}