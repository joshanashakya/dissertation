import java.util.*; public class Main{     public static void main(String[] args)    {        Scanner input = new Scanner(System.in);        int n, k;        n = input.nextInt();        k = input.nextInt();         int a[] = new int[n];        for (int i = 0; i < n; i++) {            a[i] = input.nextInt();         }        int sum[] = new int[k];        for (int i = 0; i < n; i++) {//            System.out.println(i % k);            sum[i % k] += a[i];        }        int min  = Integer.MAX_VALUE;        int ans = -1;        for (int i = k-1; i >=0; i--) {       if(min>=sum[i])       {           min = sum[i];           ans = i+1;       }        }//        System.out.println(Arrays.toString(sum));System.out.println(ans);     } }