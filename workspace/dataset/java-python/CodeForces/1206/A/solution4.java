import java.util.Scanner;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int n = s.nextInt();        int arr[] = new int[n];        int dp[] = new int[500];        for(int i = 0; i < n; i++){            arr[i] = s.nextInt();            dp[arr[i]]++;        }        int m = s.nextInt();        int bar[] = new int[m];                for(int i = 0; i < m; i++){            bar[i] = s.nextInt();            dp[bar[i]]++;        }        for(int i = 0; i < n; i++){            for(int j = 0; j < m; j++){                if(dp[bar[j]  + arr[i]] == 0){                    System.out.println(arr[i] + " " + bar[j]);                    return;                }            }        }    }}
