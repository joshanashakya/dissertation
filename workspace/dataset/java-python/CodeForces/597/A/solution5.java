import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;  public class Main {     public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        String[] temp = br.readLine().split(" ");        long k = Long.parseLong(temp[0]);        long a = Long.parseLong(temp[1]);        long b = Long.parseLong(temp[2]);        if(a < 0 && b < 0){            long t = a;            a = -b;            b = -t;        }        if(a % k == 0 || a <= 0) System.out.println((long)(b / k) - (long)(a / k) + 1);        else System.out.println((long)(b / k) - (long)(a / k));    }}