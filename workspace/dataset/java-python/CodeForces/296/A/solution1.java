import java.util.HashMap;import java.util.Scanner; public class A296 {    public static void main(String[] args) {        Scanner s = new Scanner(System.in);        HashMap<Integer, Integer> amounts = new HashMap<>();        int n = s.nextInt();        for (int i = 0; i < n; i++) {            int a = s.nextInt();            amounts.put(a, amounts.containsKey(a) ? amounts.get(a) + 1 : 1);         }        boolean answer = true;        for (int i : amounts.values()) {            if (i > (n+1)/2f) {                answer = false;                break;            }        }        System.out.println(answer ? "YES" : "NO");    }}