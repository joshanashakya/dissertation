import javafx.scene.transform.Scale;import java.util.Arrays;import java.util.Scanner;public class sweetProblem {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int num=scanner.nextInt();        for (int s = 0; s < num; s++) {            long a[] = new long[3];            for (int i = 0; i < 3; i++) {                a[i] = scanner.nextLong();            }            Arrays.sort(a);            if (a[2] >= a[0] + a[1]) System.out.println(a[0] + a[1]);            else {                System.out.println((a[0] - (a[2] - a[1])) / 2 + a[2]);            }        }    }}
