import java.util.*; public class Codeforces {    static Scanner sc;    public static void main(String[] args){        sc = new Scanner(System.in);        int t = 1;         while(t-- > 0){            solve();        }         sc.close();    }     private static void solve() {         int n = sc.nextInt();        int v = sc.nextInt();         int[] arr = new int[3001];        for(int i=0; i<n; i++)            arr[sc.nextInt()] += sc.nextInt();         int op = helper(arr, v);        System.out.println(op);    }     private static int helper(int[] arr, int v) {        int prev = 0;        int count = 0;        for(int i=1; i<=3000; i++){            int curr = v;            if(prev >= v){                count += curr;                prev = arr[i];            }            else{                count += prev;                curr -= prev;                if (arr[i] >= curr) {                    count += curr;                    prev = arr[i]-curr;                }                else {                    count += arr[i];                    prev = 0;                }            }        }        if(prev >= v){            count += v;        }        else{            count += prev;        }        return count;    }      public static void sort2dArray (long[][] arr) {        Arrays.sort(arr, (a, b) -> {            if (a[1] == b[1])                return (int) (a[0] - b[0]);            return (int) (a[1] - b[1]);        });    } }