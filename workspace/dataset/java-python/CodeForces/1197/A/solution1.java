import java.util.*; public class Solution {     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        while(t>0) {            int n = sc.nextInt();            Integer[] arr = new Integer[n];            for(int i = 0; i<n; i++) {                arr[i] = sc.nextInt();            }            Arrays.sort(arr);            int x = arr[arr.length-2] - 1;            int y = arr.length - 2;            System.out.println(Math.min(x,y));            t--;        }        sc.close();    }}