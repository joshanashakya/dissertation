import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class CF579A {    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        int x = Integer.parseInt(br.readLine());        int set_bits = 0;        while(x!=0){            set_bits+= x&1;            x>>=1;        }        System.out.print(set_bits);    }}