import java.util.*; public class CodeForces {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        String s = sc.next();        String s1 = "";        int max=0;        boolean isTrue = false;        for (int i = 0; i < t - 1; i++) {            String str = s.substring(i, i + 2);            int count = 0;            for (int j = 0; j < t - 1; j++) {                if (s.substring(j, j + 2).equals(str)) {                    count++;                }                if (count > max) {                    isTrue = true;                    s1 = str;                    max=count;                    count = 0;                }            }        }        if (isTrue) {            System.out.println(s1);        } else {            System.out.println(s.substring(0,2));        }    }}
