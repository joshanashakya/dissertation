import java.io.*;import java.lang.*;import java.util.*; public class C735 {    public static void main(String[] args) throws IOException{        StringBuffer ans = new StringBuffer();        StringTokenizer st;        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));        st = new StringTokenizer(f.readLine());        int n = Integer.parseInt(st.nextToken());        int n1 = Integer.parseInt(st.nextToken());        int n2 = Integer.parseInt(st.nextToken());        Queue<Integer> queue = new LinkedList<>();        st = new StringTokenizer(f.readLine());        Integer[] arr = new Integer[n];        for(int i = 0; i < n; i++){            arr[i] = Integer.parseInt(st.nextToken());        }        Arrays.sort(arr);        for(int x = n-1; x > -1; x--)            queue.add(arr[x]);        f.close();        int r = Math.min(n1, n2);        int c = Math.max(n1,n2);        double average = 0;        double average1 = 0;        for(int x = 0; x < r; x++){            average+=queue.poll();        }        //System.out.println(average);        for(int x = 0; x < c; x++){            average1+=queue.poll();        }        average/=r;        average1/=c;        ans.append(average+average1);          System.out.println(ans);    } }