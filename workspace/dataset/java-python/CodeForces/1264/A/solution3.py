import java.io.*;import java.util.*; final public class A {     public static void main(String[] args) throws IOException{        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringBuilder sb = new StringBuilder();        int tst = Integer.parseInt(br.readLine());        while(tst-->0){            int n = Integer.parseInt(br.readLine());            StringTokenizer st = new StringTokenizer(br.readLine());            int[] arr = new int[n];            for(int i = 0; i<n; i++){                arr[i] = Integer.parseInt(st.nextToken());            }            int[] seg = new int[n];            int cnt = 0;            for(int i = 1; i<n; i++){                if(arr[i] == arr[i-1]) seg[i] = cnt;                else seg[i] = ++cnt;            }            if(n < 10){                sb.append("0 0 0").append('\n');                continue;            }            int pt = n/2 -1;            if(arr[pt] == arr[pt + 1]){                int elm = arr[pt];                while(pt>=0 && arr[pt] == elm) pt--;            }            if(pt == -1){                sb.append("0 0 0").append('\n');                continue;            }            int len = pt+1, g = 0, s = 0, b = 0, v = seg[pt];            int pt1 = 0;            while(seg[pt1] == 0){                g++;                pt1++;            }            while(pt>=0 && seg[pt] == v){                b++;                pt--;            }            while (g >= b && pt>=0){                v = seg[pt];                while(pt>=0 && seg[pt] == v) {                    b++;                    pt--;                }            }            s = len-g-b;            if(g<s && g<b) sb.append(g+" "+s+" "+b).append('\n');            else sb.append("0 0 0").append('\n');        }        System.out.println(sb);    }}