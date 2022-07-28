import java.util.Scanner;import java.util.Set;import java.util.HashSet;import java.util.LinkedList;import java.util.Queue; public class RedBlueButton {    public static void main(String[] args) {        int n,m;        Scanner sc = new Scanner(System.in);        n = sc.nextInt();        m = sc.nextInt();        System.out.println(findMoves1(n,m));    }     public static int findMoves(int n, int m) {        Set<Integer> visited = new HashSet<>();        Queue<Integer> nodes = new LinkedList<>();        nodes.add(n);        int moves = 0;        while(!nodes.isEmpty()) {             if(nodes.contains(m)){                break;            }            Queue<Integer> children = new LinkedList<>();            while(!nodes.isEmpty()) {                Integer num = nodes.poll();                if(!visited.contains(num)) {                    visited.add(num);                    children.add(num *2);                    children.add(num -1);                }            }            nodes = children;            moves++;        }        return moves;    }     public static int findMoves1(int n, int m) {        int moves = 0;        while(m > n) {            if(m%2 != 0) {                m += 1;            }else {                m /=2;            }            moves++;        }         return moves + (n-m);    }}