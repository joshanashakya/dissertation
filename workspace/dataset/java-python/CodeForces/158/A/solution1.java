import java.util.Scanner; public class T158A {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt();        int k = scanner.nextInt();        int[] data = new int[n + 1];        int minScore = 0;        for (int i =1; i <=n ; i++) {            int score = scanner.nextInt();            data[i] = score;            if(i==k)                minScore = score;        }        int cnt = 0;        for (int j = 1; j <=n; j++) {            if (data[j] >= minScore && data[j] > 0)            cnt++;        }        System.out.println(cnt);    }}