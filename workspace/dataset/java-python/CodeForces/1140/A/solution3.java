//stan hu tao//join nct ridin by first year culture repsimport static java.lang.Math.max;import static java.lang.Math.min;import static java.lang.Math.abs;import java.util.*;import java.io.*;import java.math.*; public class x1140A{    public static void main(String hi[]) throws Exception    {        BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(infile.readLine());        int N = Integer.parseInt(st.nextToken());        int[] arr = readArr(N, infile, st);        for(int i=0; i < N; i++)            arr[i]--;        int curr = 0;        int res = 0;        while(curr < N)        {            int max = arr[curr];            while(max >= curr)            {                curr++;                if(curr > max)                    break;                if(curr < N)                    max = max(max, arr[curr]);            }            res++;        }        System.out.println(res);    }    public static int[] readArr(int N, BufferedReader infile, StringTokenizer st) throws Exception    {        int[] arr = new int[N];        st = new StringTokenizer(infile.readLine());        for(int i=0; i < N; i++)            arr[i] = Integer.parseInt(st.nextToken());        return arr;    }}
