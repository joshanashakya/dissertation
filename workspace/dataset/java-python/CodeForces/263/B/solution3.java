import java.util.*; public class Main {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt(), k = sc.nextInt();        Integer []ar = new Integer[n];        for(int i=0; i<n; i++) {            ar[i] = sc.nextInt();        }        if(k>n) {            System.out.println(-1);        }        else {            Arrays.sort(ar, Collections.reverseOrder());            System.out.println(ar[k - 1] + " " + ar[k - 1]);        }    }}
