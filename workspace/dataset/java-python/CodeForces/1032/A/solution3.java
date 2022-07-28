import java.util.Scanner; //https://codeforces.com/problemset/problem/1032/Apublic class P1032A {     private static int getStolen(int[] a, int k) {        int[] freq = new int[101];        for(int i: a) freq[i]++;        int maxUtensil = 0;        for(int f: freq) {            if(f != 0) {                maxUtensil = Math.max(f, maxUtensil);            }        }        int dish = (int)Math.ceil((float)maxUtensil/k);        int requiredUtensils = dish * k;        //System.out.println(maxUtensil + " " + dish + " " + requiredUtensils);        int count = 0;        for(int i: freq) {            if(i != 0)                count += requiredUtensils-i;        }        return count;    }     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int k = sc.nextInt();        int[] a = new int[n];        for(int i = 0; i < n; i++) a[i] = sc.nextInt();        System.out.println(getStolen(a, k));    }}
