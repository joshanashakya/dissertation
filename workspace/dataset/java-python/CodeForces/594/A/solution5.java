import java.io.*;import java.util.*; public class Main{      public static void main(String[] args) {        Scanner in = new Scanner(System.in);         int N = in.nextInt();         int[] vals = new int[N];         for(int i = 0; i < N; i++)            vals[i] = in.nextInt();        Arrays.sort(vals);         if(N == 2){            System.out.println(vals[1] - vals[0]);            return;        }         int interval = N/2;         int min1 = 0;        int min2 = 0;        int min = 0;         for(int i = 0; i + interval < N; i++){            if(min == 0 || vals[i+interval] - vals[i] < min){                min1 = i;                min2 = i + interval;                min = vals[i+interval] - vals[i];             }        }          System.out.println(min);      }}