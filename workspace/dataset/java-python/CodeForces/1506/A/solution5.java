

import java.io.IOException;
import java.util.*;

public class Main5 {
    static int[] t;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long x=sc.nextLong();

            long col=x/n;
            long row=x%n;
            if(row==0){
                col--;
                row=n-1;
            }else{
                row--;
            }
            long val=row*m+col+1;
            System.out.println(val);
        }


    }


}

