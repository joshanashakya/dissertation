import java.util.Scanner;import java.math.*; public class Main {    static long mul[] = new long[100010];    static long res = 0;    static long ans = 0;     static void dfs(long x, int len, long s){        if(x <= 7){            if(res < len + x) {                res = len + x;                ans = s + x;            }            else if(res == len + x && ans < s + x) ans = s + x;            return;        }        int lb = 1, ub = 100000;        int ans = 1;        while(ub >= lb){            int mid = ub + lb >> 1;            if(mul[mid] > x){                ub = mid - 1;            }            else{                lb = mid + 1;                ans = mid;            }        }        dfs(x - mul[ans], len + 1, s + mul[ans]);        dfs(mul[ans] - mul[ans - 1] - 1, len + 1, s + mul[ans - 1]);    }     public static void main(String args[]){        Scanner cin = new Scanner(System.in);        for(int i = 1; i <= 100000; i++) mul[i] = (long)i * i * i;        long m = cin.nextLong();        dfs(m, 0, 0);        System.out.println(res + " " + ans);    }}