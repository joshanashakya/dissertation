import java.util.*;public class Main {    public static void main(String []args) {        Scanner sc = new Scanner(System.in);        int k = Integer.parseInt(sc.next());        int[] map = new int[10];        for(int i = 0; i < 4; i++) {            for(char c : sc.next().toCharArray()) {                if(c != '.') {                    map[c - '0']++;                    if(map[c - '0'] > 2 * k) {                        System.out.println("NO");                        return;                    }                }            }        }        System.out.println("YES");    }}
