import java.util.Scanner;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int t = s.nextInt();        while(t-- != 0){        int n = s.nextInt();        long arr[] = new long[n];        long sum = 0;        for(int i = 0; i < n; i++){            arr[i] = s.nextLong();            sum += arr[i];        }        long curr = 0,max = Long.MIN_VALUE;        int start = 0,end = 0;        for(int i = 0; i < n; i++){            if(curr + arr[i] <= arr[i]){                start = i;            }            else{                end = i;            }            curr = Math.max(curr + arr[i],arr[i]);            if(curr >= max){                if(start == 0 && end == n - 1){                    continue;                }                max = Math.max(max,curr);            }        }        String ans = "NO";        if(sum > max){            ans = "YES";        }        System.out.println(ans);        }    }}
