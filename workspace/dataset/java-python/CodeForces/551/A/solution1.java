import java.util.Arrays;import java.util.Scanner; public class Bai4 {    public static void main(String[] agrs) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int[] score = new int[n];         for (int i = 0; i < n; i++) {            score[i] = sc.nextInt();        }         int[] score_sorted = score.clone();        Arrays.sort(score_sorted);         for (int i = 0; i < n; i++) {            int s = 1;            for (int j = 0; j < n; j++) {                if(score[i] < score_sorted[j]){                    s ++;                }            }            System.out.print(s + " ");        }    }}
