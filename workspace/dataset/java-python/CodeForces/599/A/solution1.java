import java.util.Scanner; public class Patrick {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int d1 = scanner.nextInt();        int d2 = scanner.nextInt();        int d3 = scanner.nextInt();         int max = Math.max(Math.max(d1, d2), d3);         int i = d1 + d2 + d3 - max;         if (d1 + d2 + d3 < i * 2) {            System.out.println(d1 + d2 + d3 );        }else{            System.out.println(i * 2);        }    }} // 100 33 34 => 134
