import java.util.*; public class Main {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);         int n = in.nextInt();        int unrated = 0;        int police = 0;        for (int i = 0; i < n; i++) {            int x = in.nextInt();            if (x != -1) {                police += x;                continue;            }            if (police == 0)                unrated++;            else                police--;         }        System.out.println(unrated);     } }  