import java.util.HashSet;import java.util.Scanner; public class A1325 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int t= scanner.nextInt();        for (int i = 0; i < t; i++) {            int n = scanner.nextInt();            HashSet<Integer> set = new HashSet<>();            for (int j = 0; j < n; j++) {                int k = scanner.nextInt();                set.add(k);            }            System.out.println(set.size());         }    }}
