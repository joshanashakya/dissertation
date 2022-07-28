import java.util.*;

public class temp {
    public static void main(String str[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int dep[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                dep[i] = sc.nextInt();

            }
            int del[] = new int[n];
            for(int i=0;i<n;i++){
                del[i] = sc.nextInt();
            }
            int curr = arr[0];
            for(int i=0;i<n-1;i++){
                int tem = (int)Math.ceil((double)(dep[i]-arr[i])/2);
                int ariv = curr+del[i];
                curr = arr[i+1]-dep[i] + Math.max(ariv+tem, dep[i]);
            }
            System.out.println(curr+ del[n-1]);
        }
    }
}

