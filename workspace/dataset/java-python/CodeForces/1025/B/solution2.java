import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.HashSet;import java.util.Set; public class Main{     static ArrayList<Integer> divi = new ArrayList<>();    static ArrayList<Integer> primos = new ArrayList<>();    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    static boolean[] marked = new boolean[1000001];     static void criba() {        marked[1] = true;        int i = 2;        for (; i < 1000; i++) {            if (!marked[i]) {                primos.add(i);                for (int j = i * i; j <= 1000000; j += i) {                    marked[i] = true;                }            }        }        for (; i <= 1000000; i++) {            if (!marked[i]) {                primos.add(i);            }        }    }     static void divisores(int n) {        divi.clear();        for (int i = 0, p = primos.get(i); p * p <= n; p = primos.get(i++)) {            while (n % p == 0) {                divi.add(p);                n /= p;            }        }        if (n > 1) {            divi.add(n);        }    }     public static void main(String[] args) throws IOException {        Set<Integer> divisoresTotales = new HashSet<Integer>();        criba();        int q = Integer.parseInt(br.readLine());        String entrada[] = br.readLine().split(" ");        int refA = Integer.parseInt(entrada[0]);        int refB = Integer.parseInt(entrada[1]);        divisores(refA);        divisoresTotales.addAll(divi);        divisores(refB);        divisoresTotales.addAll(divi);         for (int i = 0; i < q - 1; i++) {            Set<Integer> divisores2 = new HashSet<>(divisoresTotales);            String entrada2[] = br.readLine().split(" ");            int a = Integer.parseInt(entrada2[0]);            int b = Integer.parseInt(entrada2[1]);            for (int j : divisoresTotales) {                if (a % j != 0 && b % j != 0) {                    divisores2.remove(j);                }            }            divisoresTotales=divisores2;        }        if (divisoresTotales.isEmpty()){            System.out.println("-1");        }else{            System.out.println(divisoresTotales.toArray()[0]);        }    }}  	 			  	  				 	 	   			  				
