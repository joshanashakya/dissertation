import java.util.*;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int n = s.nextInt();        int k = s.nextInt();        int arr[] = new int[n];        int check[] = new int[n];        for(int i = 0; i < n; i++){            arr[i] = s.nextInt();            check[i] = arr[i];        }        Arrays.sort(check);        int sum = 0;        int dp[] = new int[2001];        int i = n - 1;        while(k > 0){            dp[check[i]]++;            sum += check[i];            i--;            k--;                    }        int prev = -1;        ArrayList<Integer> list = new ArrayList<>();        for(i = 0; i < n; i++){            if(dp[arr[i]] > 0){                list.add(i - prev);                dp[arr[i]]--;                prev = i;             }        }        System.out.println(sum);        sum = 0;        for( i = 0; i < list.size() - 1; i++){            System.out.print(list.get(i) + " ");            sum += list.get(i);        }        System.out.print(n - sum + " ");    }}
