import java.util.Scanner;import java.util.ArrayList;import java.util.Collections;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int t = s.nextInt();        while(t-- != 0){            int n = s.nextInt();            long arr[] = new long[n];            for(int i = 0; i < n; i++){                arr[i] = s.nextLong();            }            ArrayList<Long> unlocked = new ArrayList<>();            ArrayList<Long> locked = new ArrayList<>();            int index[] = new int[n];            for(int i = 0; i < n; i++){                int k = s.nextInt();                if(k == 0){                    unlocked.add(arr[i]);                }                else{                    locked.add(arr[i]);                }                index[i] = k;            }            Collections.sort(unlocked,Collections.reverseOrder());            long sum = 0;            int i = 0,j = 0,k = 0;            while(k < n){                if(index[k] == 0){                    System.out.print(unlocked.get(j) + " ");                    j++;                }                else{                    System.out.print(locked.get(i) + " ");                    i++;                }                k++;            }            System.out.println();                   }    }}
