public class p1143B {    public static void main(String[] args) {        System.out.println(max(new java.util.Scanner(System.in).nextInt()));    }    static int max(int n) {        return n<10?Math.max(1, n):Math.max((n%10)*max(n/10), 9*max(n/10-1));    }}
