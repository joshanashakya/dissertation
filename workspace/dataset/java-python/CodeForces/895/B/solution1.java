import java.io.*;import java.util.*; public class Main {     public static void main(String[] args) throws Exception {        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(in.readLine());        long n = Integer.parseInt(st.nextToken());        long x = Integer.parseInt(st.nextToken());        long k = Integer.parseInt(st.nextToken());        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());        st = new StringTokenizer(in.readLine());        for (int i = 0; i < n; i++) {            pq.offer((long)Integer.parseInt(st.nextToken()));        }        HashMap<Long, Long> map = new HashMap<>();        long res = 0;        long charge = 0;        while (!pq.isEmpty()) {            long i = pq.poll();            long floor = (i/x)*x;            if (!map.containsKey(floor)) {                map.put(floor, (long) 0);            }            map.put(floor, map.get(floor)+1);            charge++;             if (!pq.isEmpty() && pq.peek() == i) {                continue;            }              long ceil = (i/x)*x;            if (i % x != 0) {                ceil += x;            }             //System.out.println("polling " + i + " c: " + ceil + " f:" + floor);            long query = ceil+((k-1)*x);            //System.out.println("QUERY: " + query);            if (map.containsKey(query)) {                res += map.get(query)*charge;            }            charge = 0;        }        System.out.println(res);    } }
