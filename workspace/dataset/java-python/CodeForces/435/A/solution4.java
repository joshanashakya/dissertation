import java.util.Scanner; public class Main {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int n = in.nextInt();        int m = in.nextInt();        int[] a = new int[n];        for (int i = 0; i < n; i++)            a[i] = in.nextInt();         int cnt = 0;        int sum;        for (int i = 0; i < n; i++) {            ++cnt;            sum=a[i];            for (int j = i+1; j < n; j++) {                sum+=a[j];                if(sum<=m){                    ++i;                }            }        }        System.out.println(cnt);    }//End Main}//End Class
