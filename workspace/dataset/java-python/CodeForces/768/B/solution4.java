//package Questions; import java.util.*;public class Code4One {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        long n = sc.nextLong(), l = sc.nextLong(), r = sc.nextLong();        int ans = 0;        String str = Long.toBinaryString(n);        for (long x = l; x <= r; x++) {            int index = Long.toBinaryString(Long.lowestOneBit(x)).length() - 1;            if (str.charAt(index) == '1')                ans++;        }        System.out.print(ans);    }}
