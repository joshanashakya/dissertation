import java.util.*; public class NewClass{    public static void main(String args[]){        Scanner sc = new Scanner(System.in);                int n = sc.nextInt(), cx = 0, cy = 0;        String x = null, y = null;                for (int i = 0; i < n; i++){            String g = sc.next();                        if (x == null){                x = g;                cx++;            }            else if (y == null && !g.equals(x)){                y = g;                cy++;            }            else if (g.equals(y)) cy++;            else cx++;        }                if (cy > cx) System.out.println(y);        else System.out.println(x);    }}