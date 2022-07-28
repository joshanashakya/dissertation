//package albert.codeforces.litttleelephantandcards204b; import java.util.HashMap;import java.util.HashSet;import java.util.Map;import java.util.Scanner;import java.util.Set; public class Solution {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);        int n = scan.nextInt();        Map<Integer, Integer> front = new HashMap<>();        Map<Integer, Integer> back = new HashMap<>();        Map<Integer, Integer> possible = new HashMap<>();        int half = (int) Math.ceil((n * 1.0) / 2);        Set<Integer> wtf = new HashSet<>();        for (int i = 0; i < n; i++) {            int f = scan.nextInt();            int b = scan.nextInt();            front.put(f, front.getOrDefault(f, 0) + 1);            back.put(b, back.getOrDefault(b, 0) + 1);            possible.put(f, possible.getOrDefault(f, 0) + 1);            if (f != b) {                possible.put(b, possible.getOrDefault(b, 0) + 1);            }            if (possible.get(f) >= half) {                wtf.add(f);            } else if (possible.get(b) >= half) {                wtf.add(b);            }        }        if (wtf.isEmpty()) {            System.out.println(-1);        } else {            int min = Integer.MAX_VALUE;            for (Integer card : wtf) {                if (front.getOrDefault(card, 0) >= half) {                    System.out.println(0);                    return;                } else {                    int rest = half - front.getOrDefault(card, 0);                    min = Math.min(min, rest);                }            }            System.out.println(min);        }    }}