import java.util.Arrays;import java.util.Scanner; public class solution {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int total = sc.nextInt();        int ride = sc.nextInt();        int a = sc.nextInt();        int b = sc.nextInt();        int ans = total * a;        int count = ride;        while (count <= total) {            ans = Math.min(ans, count / ride * b + (total - count) * a);            count += ride;        }        System.out.println(Math.min(total % ride == 0 ? total / ride * b : (total / ride + 1) * b, ans));    }}