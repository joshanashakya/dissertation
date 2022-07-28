import java.util.*;import java.io.*; public class CF780B2 {	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    static int[][] arr;    static int n;    static final double PRECISION = 1e-8; 	public static void main(String[] args) throws IOException {        n = Integer.parseInt(br.readLine());        arr = new int[n][2];                String[] stringArr = br.readLine().split(" ");        int largest = 0;        for(int i = 0; i < n; i++) {            int curr = Integer.parseInt(stringArr[i]);            arr[i][0] = curr;            largest = Math.max(largest, curr);        }         stringArr = br.readLine().split(" ");        for(int i = 0; i < n; i++) {            int curr = Integer.parseInt(stringArr[i]);            arr[i][1] = curr;        }         // Find max        double maxSeconds = 1E9;        // for(int i = 0; i < n; i++) {        //     maxSeconds = Math.max(maxSeconds, (double)(largest - arr[i][0])/arr[i][1]);        // }         // for(int i = 0; i < n; i++) {        //     maxSeconds = Math.max(maxSeconds, (double)arr[i][0]/arr[i][1]);        // }         double ans = binarySearch(0, maxSeconds, 1000);        bw.write(ans + "\n"); 		bw.close();    }     public static double binarySearch(double L, double R, int count) {        if(L > R || count == 0) return (double)Math.round(L*10000000L)/10000000L;         double M = (L+R)/2;        double intersectionLength = getIntersection(M);         // System.out.println(L + " " + R);         if(intersectionLength == 0) {            return M;        }         if(intersectionLength < 0) {            return binarySearch(M+PRECISION, R, count - 1);        }         return binarySearch(0, M, count - 1);    }     public static double getIntersection(double currTime) {        double biggestLeft = 0;        double smallestRight = Double.MAX_VALUE;        for(int i = 0; i < n; i++) {            biggestLeft = Math.max(biggestLeft, (double)arr[i][0] - currTime*arr[i][1]);            smallestRight = Math.min(smallestRight, (double)arr[i][0] + currTime*arr[i][1]);        }         // System.out.println(biggestLeft + " " +smallestRight);         return smallestRight - biggestLeft;    }}