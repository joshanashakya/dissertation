/*TASK: templateLANG: JAVA*/import java.io.*;import java.lang.*;import java.util.*; public class Training3_C {    public static void main(String[] args) throws IOException{        StringTokenizer st;        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));        st = new StringTokenizer(f.readLine());        int n = Integer.parseInt(st.nextToken());        int m = Integer.parseInt(st.nextToken());        int ta = Integer.parseInt(st.nextToken());        int tb = Integer.parseInt(st.nextToken());        int k = Integer.parseInt(st.nextToken());        long[] arr = new long[n];        long[] arr1 = new long[m];        st = new StringTokenizer(f.readLine());        for(int i = 0; i < n; i++){            arr[i] = Long.parseLong(st.nextToken());        }        st = new StringTokenizer(f.readLine());        for(int i = 0; i < m; i++){            arr1[i] = Long.parseLong(st.nextToken());        }         f.close();        long start = arr[k-1] + ta;        int end = -1;        for(int i = 0; i < m; i++){            if(arr1[i] >= start){                end = i;            }        }        if(end == -1){            System.out.println(-1);            return;        }        long best = -1;        for(int i = k; i > -1; i--){            int index = k;            if (k >= n) {                int r = k-n;                best = Math.min(best, arr1[r]+tb);            }else {                index = Arrays.binarySearch(arr1, arr[i] + ta);                if (index < 0) {                    index = Math.abs(index+1) + (k-i);                }                //System.out.println(index + " " + (i));                 if (index >= m) {                    System.out.println(-1);                    return;                }                best = Math.max(best, arr1[index] + tb);            }        }        System.out.println(best);     }}