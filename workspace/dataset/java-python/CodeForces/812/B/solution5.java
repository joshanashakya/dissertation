import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class SagheeertheHausmeister {     static int n;    static int m;    static char[][] arr;    static int lastnonemptyi;     static Pair isEmpty(char[] a) {         int num = 0;        int lastposof1 = 0;        int firsposof1 = 0;        boolean flag = true;         for (int i = 0; i < a.length; i++) {             if (a[i] == '1') {                num++;                lastposof1 = i;                 if (flag) {                    firsposof1 = i;                    flag = false;                }            }        }         return new Pair(num, lastposof1, firsposof1);    }     static int solve(int i, int j, int ans) {          Pair temp = isEmpty(arr[i]);         if (i == lastnonemptyi || i == 0){             if (j==0)                return ans+temp.lastposof1;            return ans+((m+1)   -temp.firstposof1);         }         if (temp.numof1s == 0)            return solve(i - 1, j, ans + 1);         else {             if (j == 0) {                 int left = solve(i - 1, 0, ans + temp.lastposof1 * 2 + 1);                int right = solve(i - 1, m + 1, ans + m + 2);//                int right = solve(i - 1, m + 1, ans + temp.lastposof1 + (m + 1 - temp.lastposof1) + 1);                  return Math.min(left, right);             }             int left = solve(i - 1, 0, ans + m + 2);//            int left = solve(i - 1, 0, ans + temp.firstposof1 + (m + 1 - temp.firstposof1) + 1);            int right = solve(i - 1, m + 1, ans + (m + 1 - temp.firstposof1) * 2 + 1);             return Math.min(left, right);         }     }      public static void main(String[] args) throws IOException {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st;        PrintWriter pw = new PrintWriter(System.out);         st = new StringTokenizer(br.readLine());        n = Integer.parseInt(st.nextToken());        m = Integer.parseInt(st.nextToken());        arr = new char[n][m + 2];        boolean flag = true;        lastnonemptyi = n - 1;          for (int i = 0; i < n; i++) {             arr[i] = (br.readLine()).toCharArray();            int temp = isEmpty(arr[i]).numof1s;             if (temp != 0 && flag) {                lastnonemptyi = i;                flag = false;            }         }         pw.println(solve(n-1,0,0));        pw.close();     }     static class Pair {         int numof1s;        int lastposof1;        int firstposof1;         Pair(int numof1s, int lastposof1, int firstposof1) {             this.numof1s = numof1s;            this.lastposof1 = lastposof1;            this.firstposof1 = firstposof1;        }     } }
