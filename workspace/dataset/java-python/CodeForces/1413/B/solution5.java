import java.io.*;import java.lang.*;import java.util.*; public class b {    static BufferedReader f;    static StringTokenizer st;    static StringBuilder ans = new StringBuilder();    public static void tc() throws IOException{        st = new StringTokenizer(f.readLine());        int n = Integer.parseInt(st.nextToken());        int m = Integer.parseInt(st.nextToken());        int[] arr = new int[n*m];        int[][] grid = new int[n][m];        //System.out.println(n + " " + m);        for(int i = 0; i < n; i++){            st = new StringTokenizer(f.readLine());            for(int x = 0; x < m; x++) {                int curr = Integer.parseInt(st.nextToken())-1;                arr[curr] = i;                grid[i][x] = curr;            }        }        //System.out.println(Arrays.deepToString(grid));        int[] op = new int[n];        st = new StringTokenizer(f.readLine());        for(int i = 0; i < n; i++){            int curr = Integer.parseInt(st.nextToken())-1;            op[i] = arr[curr];        }        for(int i = 0; i < m-1; i++){ st = new StringTokenizer(f.readLine());}        for(int i = 0; i < n; i++){            for(int x = 0; x < m; x++){                ans.append(grid[op[i]][x]+1 + " ");            }            ans.append("\n");        }    }     public static void main(String[] args) throws IOException{        f = new BufferedReader(new InputStreamReader(System.in));        st = new StringTokenizer(f.readLine());        int t = Integer.parseInt(st.nextToken());        for(int i = 0; i < t; i++){            tc();        }        System.out.println(ans);        f.close();     }}