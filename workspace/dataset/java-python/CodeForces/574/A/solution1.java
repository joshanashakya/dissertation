import java.util.*;public class p574A {    public static void main(String[] args) {        Scanner sc=new Scanner(System.in);        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());        int n=sc.nextInt(),x=sc.nextInt(),c=0;        while(n-->1) pq.add(sc.nextInt());        while(x<=pq.peek()) {pq.add(pq.poll()-1);x++;c++;}        System.out.println(c);    }}