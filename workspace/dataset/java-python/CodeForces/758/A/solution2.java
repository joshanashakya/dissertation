import java.util.*; public class Main {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);         int n = in.nextInt();        int existed = 0;        int max = 0;        for (int i = 0; i < n; i++) {            int x = in.nextInt();            existed += x;            max = Math.max(max, x);        }        System.out.println(n * max - existed);    } }  
