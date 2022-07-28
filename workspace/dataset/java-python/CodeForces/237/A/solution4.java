import java.util.HashMap;import java.util.Scanner; public class Problem_237A {    public static void main(String[] args) {        Scanner s = new Scanner(System.in);        int n = s.nextInt();        HashMap<String, Integer> timeFreq = new HashMap<>();        int cashes = 1;        while(n-- > 0) {            String H = s.next();            String M = s.next();            String time = H.concat(":").concat(M);             timeFreq.computeIfPresent(time, (K,V) -> V + 1);            timeFreq.putIfAbsent(time, 1);            cashes = Math.max(timeFreq.get(time), cashes);        }         System.out.println(cashes);    }}
