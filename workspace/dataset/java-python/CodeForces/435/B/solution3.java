import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Maximizer {    public static void main(String[] args) throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(reader.readLine());         String num = st.nextToken();        int n = num.length();        char[] a = num.toCharArray();         int k = Integer.parseInt(st.nextToken());         for (int i = 0; i < n - 1; i++) {            if(k == 0) break;            int max = i;             for (int j = i + 1; j < i + k + 1 && j < n; j++) if(a[j] > a[max]) max = j;             int ok = max - i;            if(ok > 0){                char x = a[max];                while (max > i) {                    a[max] = a[max - 1];                    max--;                }                a[max] = x;                k -= ok;            }        }         StringBuilder ans = new StringBuilder();         for (int i = 0; i < n; i++) {            ans.append(a[i]);        }         System.out.println(ans);    }}
