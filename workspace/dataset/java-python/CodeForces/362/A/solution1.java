import java.io.*;import java.util.*; import static java.lang.Math.max;import static java.lang.Math.min;import static java.lang.StrictMath.abs;  public class Solution implements Runnable {    public static void main(String[] args) throws IOException, InterruptedException {        //System.setIn(new FileInputStream("input.txt"));        //System.setOut(new PrintStream(new FileOutputStream("output.txt")));        Thread t = new Thread(null, new Solution(), "solutionThread", 1 << 28);        t.start();    }     @Override    public void run() {        Scanner sc = new Scanner( System.in );        int[][] ar = {                {1,2,3,4,1,2,3,4},                {5,6,7,8,5,6,7,8},                {3,4,1,2,3,4,1,2},                {7,8,5,6,7,8,5,6},                {1,2,3,4,1,2,3,4},                {5,6,7,8,5,6,7,8},                {3,4,1,2,3,4,1,2},                {7,8,5,6,7,8,5,6}        };        int t = sc.nextInt();        for ( int i = 0; i < t; i++ ) {            int a = -1, b=-1, c=-1, d=-1;            for ( int j = 0; j < 8; j++ ) {                String s = sc.next();                for ( int k = 0; k < s.length(); k++ ) {                    if ( s.charAt( k )=='K' ) {                        if ( a==-1 ) {                            a = j;                            b = k;                        }                        else {                            c = j;                            d = k;                        }                    }                }            }            if ( ar[a][b] == ar[c][d] && (abs(a-c)==4 || abs(b-d)==4)) {                System.out.println("YES");            }            else {                System.out.println("NO");            }        }     } }/*  , ,*/
