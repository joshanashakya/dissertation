import java.util.Scanner; public class MidBalls {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int n = scanner.nextInt();        int m = scanner.nextInt();         StringBuilder ans = new StringBuilder();         if(m%2 != 0) {            while (n > 0) {                int left = (m + 1) / 2 - 1;                int right = left + 1;                 while ((left > 0 || right <= m) && n > 0) {                    ans.append(right + "\n");                    right++;                    n--;                     if (left == 0 || n == 0) continue;                    ans.append(left + "\n");                    left--;                    n--;                }            }        } else {            while (n > 0) {                int left = m/ 2;                int right = left + 1;                 while ((left > 0 || right <= m) && n > 0) {                    ans.append(left + "\n");                    left--;                    n--;                     if (right > m || n == 0) continue;                    ans.append(right + "\n");                    right++;                    n--;                }            }        }        System.out.println(ans);    }}