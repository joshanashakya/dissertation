//package Graphs; import java.util.Scanner; public class LoveTriangle_cf {      public void run(){        Scanner in = new Scanner(System.in);        int n = in.nextInt();        int[] array = new int[n];        for (int i = 0; i < n; i++) {            array[i] = in.nextInt();        }         int s;        for (int i = 0; i < n; i++) {            s = i+1;            if (array[array[array[i] - 1] - 1] == s){                System.out.println("YES");                return;            }        }         System.out.println("NO");    }      public static void main(String[] args) {        new LoveTriangle_cf().run();    }}