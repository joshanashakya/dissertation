import java.util.*; public class Starting {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);         int k = sc.nextInt();        int[] arr = new int[12];        for (int i = 0; i < 12; i++) arr[i] = sc.nextInt();         Arrays.sort(arr);         int sum = 0, ans = 0;        for (int i = 11; i >= 0; i--) {            sum += arr[i];            ++ans;            if (sum >= k) break;        }         if (k == 0) System.out.println("0");        else if (sum < k) System.out.println("-1");        else System.out.println(ans);         sc.close();    }}