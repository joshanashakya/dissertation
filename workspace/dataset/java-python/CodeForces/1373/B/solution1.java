import java.util.*; public class CodeForces {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        for (int i = 0; i < t; i++) {            int index_0 = 0;            int index_1 = 0;            String s = sc.next();            for (int j = 0; j < s.length(); j++) {                if (s.charAt(j) == '1') {                    index_1++;                } else {                    index_0++;                }            }            if (Math.min(index_0,index_1)%2!=0) {                System.out.println("DA");            } else {                System.out.println("NET");            }        }    }}