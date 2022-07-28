

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            t--;
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            boolean x=true;
            for (int i = 0; i < n-1; i++) {
                if(a[i+1]-a[i]>1){
                    x=false;
                    break;
                }
            }
            if(x || n==1)
                System.out.println("YES");
            else
                System.out.println("NO");


        }
    }//End Main
}//End Class

