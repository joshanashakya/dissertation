import java.util.*;import java.io.*; public class B {    public static void main(String[] args) throws IOException{        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));        int n = Integer.parseInt(f.readLine());        int[][] strength = new int[2*n][2*n];        for(int i = 1; i < 2*n; i++){            StringTokenizer st = new StringTokenizer(f.readLine());            for(int j = 0; j < i; j++){                strength[i][j] = Integer.parseInt(st.nextToken());                strength[j][i] = strength[i][j];            }        }        HashSet<Integer> seen = new HashSet<Integer>();        int[] teams = new int[2*n];        for(int i = 0; i < n; i++){            int maxr = -1;            int maxc = -1;            int maxS = Integer.MIN_VALUE;            for(int j = 0; j < 2*n; j++){                if(seen.contains(j)) continue;                for(int k = 0; k <= j; k++){                    if(seen.contains(k)) continue;                    if(strength[j][k] > maxS){                        maxr = j;                        maxc = k;                        maxS = strength[j][k];                    }                }            }            seen.add(maxc);            seen.add(maxr);            teams[maxr] = maxc+1;            teams[maxc] = maxr+1;        }        StringBuilder ans = new StringBuilder();        for(int i: teams){            ans.append(i);            ans.append(" ");        }        out.println(ans.toString().trim());        out.close();     }}