import java.util.Scanner; public class Main{    public static void main(String[] args){        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int k = sc.nextInt();        int[] a = new int[101];        for(int i=0; i<n; i++)            a[sc.nextInt()]++;        int count = 0;        while(a[k] != n){            for(int i=k-1; i>0; i--){                if(a[i] > 0){                    a[i]--;                    a[i+1]++;                }            }            count++;        }        System.out.println(count);        sc.close();    }}