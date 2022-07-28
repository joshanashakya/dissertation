import java.util.Scanner;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int t = s.nextInt();        while(t-- != 0){            int n = s.nextInt();            long k = s.nextLong();            long arr[] = new long[n + 1];            long prefix[] = new long[n + 1];            long sum = 0;            for(int i = 1; i <=n; i++){                arr[i] = s.nextLong();                prefix[i] = prefix[i - 1] + arr[i];                sum += arr[i];            }            if(sum <= k){                System.out.println(0);                continue;            }            int ans = 0,total = -1;            for(int i = 1; i <= n && prefix[i - 1] <= k; i++){                int start = i + 1,end = n;                int as = start;                while(start <= end){                int mid = (start + end)/2;                if(prefix[mid] - arr[i] <= k){                    as = mid;                    start = mid + 1;                  }                 else{                     end = mid - 1;                  }               }               //System.out.println(as - 1);                if(as - 1 > total){                    total = as - 1;                    ans = i;                 }            }            System.out.println(ans);         }    }    }
