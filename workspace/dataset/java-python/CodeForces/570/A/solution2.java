import java.util.Scanner; public class ElectionSystem {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int n = scanner.nextInt();        int m = scanner.nextInt();         int[] candidate = new int[n];         for (int i = 0; i < m; i++) {            int max = 0;            int maxVal = 0;             for (int j = 0; j < n; j++) {                int curr = scanner.nextInt();                if(maxVal < curr){                    maxVal = curr;                    max = j;                }            }             candidate[max]++;        }         int max = 0;        for (int i = 0; i < n; i++) {            if(candidate[max] < candidate[i]) max = i;        }         System.out.println(max + 1);    }}
