import java.util.*;public class Main {    public static void main (String[] args){        Scanner sc = new Scanner(System.in);                int n = sc.nextInt();        int [] arr = new int[n];        for(int i = 0 ;  i < n ; i++ )            arr[i] = sc.nextInt();        Arrays.sort(arr);        boolean flag = false;        for(int i = 0 ; i < n-1 ; i++)            if(arr[i] *2 > arr[i+1] && arr[i]!=arr[i+1])                flag = true;                    System.out.println(flag?"YES":"NO");    }}
