import java.lang.*;import java.util.*; public class Abhishek {     public static void main(String[] args) throws Exception {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        while (t-- > 0) {            int n = sc.nextInt();            int[] a = new int[101];            for (int i = 0; i < n; i++) {                a[sc.nextInt()]++;            }            int mexA = -1, mexB = -1;            for (int i = 0; i < a.length; i++) {                if (a[i] <= 1 && mexA == -1)                    mexA = i;                if (a[i] == 0 && mexB == -1)                    mexB = i;            }            System.out.println(mexA+mexB);        }     }}
