import java.util.*; public class solution {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        long[] flower = new long[n];        for (int i = 0; i < n; i++) {            flower[i] = sc.nextInt();        }        HashMap<Integer, Integer> map = new HashMap<>();        long min = Integer.MAX_VALUE;        long max = 0;        for (long i : flower) {            min = Math.min(min, i);            max = Math.max(max, i);        }        long count_max = 0;        long count_min = 0;        for (long i : flower) {            if (i == max) {                count_max++;            }            if (i == min) {                count_min++;            }        }        if (max == min) {            if (count_max % 2 == 0) {                System.out.println(0 + " " + (count_max / 2) *(count_max - 1));            } else {                System.out.println(0 + " " + ((count_max - 1)/ 2) *count_max);            }        } else {            System.out.print((max - min) + " ");            System.out.println(count_max * count_min);        }    }}