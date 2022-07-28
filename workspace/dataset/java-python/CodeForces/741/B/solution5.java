import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class Solution {    public static int[] dfs(ArrayList<Integer>[] graph, int[] weight, int[] beauty,                            boolean[] mark, HashMap<Integer, Integer> group, int x) {        mark[x] = true;        group.putIfAbsent(weight[x], beauty[x]);        group.replace(weight[x], Math.max(group.get(weight[x]), beauty[x]));        int W = weight[x], B = beauty[x];        for (int y:graph[x]) {            if (mark[y]) continue;            int[] newarray = dfs(graph, weight, beauty, mark, group, y);            W+=newarray[0];            B+=newarray[1];        }        return new int[]{W, B};    }    public static void main(String[] args) throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer stoken = new StringTokenizer(reader.readLine());        int n = Integer.parseInt(stoken.nextToken());        int m = Integer.parseInt(stoken.nextToken());        int w = Integer.parseInt(stoken.nextToken());        int[] weight = new int[n];        stoken = new StringTokenizer(reader.readLine());        for (int i=0; i<n; i++) weight[i] = Integer.parseInt(stoken.nextToken());        int[] beauty = new int[n];        stoken = new StringTokenizer(reader.readLine());        ArrayList<Integer>[] graph = new ArrayList[n];        for (int i=0; i<n; i++) {            beauty[i] = Integer.parseInt(stoken.nextToken());            graph[i] = new ArrayList<Integer>();        }        for (int i=0; i<m; i++) {            stoken = new StringTokenizer(reader.readLine());            int x = Integer.parseInt(stoken.nextToken())-1;            int y = Integer.parseInt(stoken.nextToken())-1;            graph[x].add(y); graph[y].add(x);        }        boolean[] mark = new boolean[n];        int[] res = new int[w+1];        for (int i=0; i<n; i++) {            if (!mark[i]) {                HashMap<Integer, Integer> group = new HashMap<>();                int[] array = dfs(graph, weight, beauty, mark, group, i);                int newweight = array[0], newbeauty = array[1];                group.putIfAbsent(newweight, newbeauty);                group.replace(newweight, Math.max(group.get(newweight), newbeauty));                ArrayList<Integer> list = new ArrayList<>(group.keySet());                int length = list.size();                Collections.sort(list);                for (int j=w; j>-1; j--) {                    int result = res[j];                    for (int elem:list) {                        if (elem>j) break;                        result = Math.max(result, res[j-elem]+group.get(elem));                    }                    res[j] = result;                }            }        }        int ans = 0;        for (int elem:res) ans = Math.max(ans, elem);        System.out.println(ans);    }}
