import java.util.*;public class A {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int T = in.nextInt();        for (int t = 0; t < T; t++) {            int[] arr = new int[3];            for (int i = 0; i < 3; i++) {                arr[i] = in.nextInt();            }            Arrays.sort(arr);            if (arr[1] == arr[2]) {                System.out.println("YES\n" + arr[0] + " " + arr[0] + " " + arr[1]);            } else {                System.out.println("NO");            }        }    }}