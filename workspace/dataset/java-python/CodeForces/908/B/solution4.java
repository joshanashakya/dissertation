import java.util.*; public class NewYearandBuggyBot {     static int n, m, x, y, ans, idx, idy, done;    static char[][] map;    static String seq;    static HashSet<Character> set;    static char[] arr;    static boolean visited[];     public static void solve(int i) {        if (i == seq.length()) {            return;        }        if (arr[seq.charAt(i) - '0'] != '0') {            char at = arr[seq.charAt(i) - '0'];            if (at == 'u') {                idy++;            } else if (at == 'd') {                idy--;            } else if (at == 'r') {                idx++;            } else {                idx--;            }            if (idx < 0 || idx >= m || idy < 0 || idy >= n || map[idy][idx] == '#') {            } else if (map[idy][idx] == 'E') {                if(done == 1){                    ans += 6;                }else if(done == 2){                    ans += 2;                }else{                    ans++;                }            } else {                solve(i + 1);            }            if (at == 'u') {                idy--;            } else if (at == 'd') {                idy++;            } else if (at == 'r') {                idx--;            } else {                idx++;            }        } else {            for (char c : set) {                if (!visited[c - 'a']) {                    visited[c - 'a'] = true;                    arr[seq.charAt(i) - '0'] = c;                    done++;                    solve(i);                    done--;                    arr[seq.charAt(i) - '0'] = '0';                    visited[c - 'a'] = false;                }            }        }    }     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        n = in.nextInt();        m = in.nextInt();        map = new char[n][m];        x = -1;        y = -1;        for (int i = 0; i < n; i++) {            String st = in.next();            for (int j = 0; j < m; j++) {                map[i][j] = st.charAt(j);                if (map[i][j] == 'S') {                    x = j;                    y = i;                }            }        }        seq = in.next();        ans = 0;        set = new HashSet<>();        set.add('u');        set.add('d');        set.add('r');        set.add('l');        arr = new char[4];        Arrays.fill(arr, '0');        visited = new boolean[26];        for (Character c : set) {            arr[0] = c;            visited[c - 'a'] = true;            done = 1;            idx = x;            idy = y;            solve(0);            visited[c - 'a'] = false;            arr[0] = '0';        }        System.out.println(ans);    }}/*  */