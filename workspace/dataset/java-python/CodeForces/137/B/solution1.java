import java.util.*; public class cPermutation {        public static void main(String[] args) {                Scanner scan = new Scanner(System.in);                //if skip index 0        // increase array size        // loop i = 1        // when size is 1 <= a <= 5000        int N = scan.nextInt();        int falsecounter = 0;        boolean arr[] = new boolean[N+1];        for (int i = 1; i <= N; i++) {            int nextNum = scan.nextInt();            if (nextNum <= N) {                arr[nextNum] = true;            }        }        for (int i = 1; i <= N; i++) {            if (arr[i] == false) {                falsecounter++;            }        }                System.out.println(falsecounter);                            }    }