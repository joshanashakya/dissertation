import java.util.Scanner; public class Ultra_Fast_Mathematician {     static Scanner sc = new Scanner(System.in);    public static void main(String[] args) {        String s1 = sc.next();        String s2 = sc.next();        StringBuilder sum = new StringBuilder();        for(int i = 0; i < s1.length(); i++) {            int n = s1.charAt(i) - '0';            int m = s2.charAt(i) - '0';            if((n + m) == 1) {                sum.append("1");            } else {                sum.append("0");            }        }        System.out.println(sum.toString());    }}