import java.util.HashSet;import java.util.Scanner; public class Main {    static char[][] map = new char[100+10][100+10];    static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};    static int m, n;    static char c;    static HashSet<Character> set = new HashSet<Character>();    static int ans = 0;    static int[] vis = new int[100+10];     public static boolean judge(int x, int y) {        if(x < 1 || y < 1 || x > m || y > n) return false;        else return true;    }     public static void dfs(int x, int y) {        if(x < 1 || y < 1 || x > m || y > n) {            return ;        }        for (int i = 0; i < 4; i++) {            int x_next = x + dir[i][0];            int y_next = y + dir[i][1];            if(map[x_next][y_next] != '.' && judge(x_next, y_next)) {                if(map[x_next][y_next] == c) {                    map[x_next][y_next] = '.';                    dfs(x_next, y_next);                }                else {                    vis[map[x_next][y_next] - 'A' + 1] = 1;                    map[x_next][y_next] = '.';                }            }        }    }    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        m = in.nextInt();        n = in.nextInt();        c = in.next().charAt(0);        String str;        str = in.nextLine();        for (int i = 1; i <= m; i++) {            str = in.nextLine();            for (int j = 1; j <= n; j++) {                map[i][j] = str.charAt(j-1);            }        }        for (int i = 1; i <= m; i++) {            for (int j = 1; j <= n; j++) {                if(map[i][j] == c) {                    map[i][j] = '.';                    dfs(i, j);                }            }        }        for (int i = 1; i<= 26; i++) {            ans += vis[i];        }        System.out.println(ans);    }}		 	  	  		 	 	 	 	  				   	