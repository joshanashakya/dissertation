import java.io.*;
import java.nio.ByteBuffer;
import java.util.*;

public class MAIN{

    private static BufferedReader reader = null;
    private static BufferedWriter writer = null;

    public static void main(String[] args) throws Exception{

        reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String[] parts = new String[]{s.substring(0, s.indexOf('.')),s.substring(s.indexOf('.')+1)};
        if(parts[0].endsWith("9")){
            System.out.println("GOTO Vasilisa.");
        } else {
            if(("0."+parts[1]).compareTo("0.5") < 0){
                System.out.println(parts[0]);
            } else {
                char c = parts[0].charAt(parts[0].length()-1);
                System.out.println(parts[0].substring(0,parts[0].length()-1)+((char)(c+1)));
            }
        }

    }

    private static int sum(String s){
        int sum = 0;
        String[] strs = s.split("\n");
        try{
            for(int i=0; i< strs.length; ++i){
                sum += Integer.parseInt(strs[i]);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return sum;
    }

    private static byte[] readFile(File file){
        ByteArrayOutputStream bout = null;
        BufferedInputStream bis = null;
        try{
            bout = new ByteArrayOutputStream(0);
            bis = new BufferedInputStream(new FileInputStream(file));
            int readNum;
            byte[] data = new byte[1024];
            while ((readNum = bis.read(data)) >= 0){
                bout.write(data, 0, readNum);
            }
        }catch (Exception e){
            e.printStackTrace();
            bout = null;
        }
        try{
            if (bis != null) {
                bis.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return bout != null ? bout.toByteArray() : null;
    }



    private static class IntIntPair{
        int first;
        int second;
        public IntIntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
        public IntIntPair getInversePair(){
            return new IntIntPair(
                    this.second,
                    this.first
            );
        }
        public boolean equals(IntIntPair p){
            return p.first == this.first && p.second == this.second;
        }
    }
    private static class StringStringPair{
        String first;
        String second;
        public StringStringPair(String first, String second) {
            this.first = first;
            this.second = second;
        }
        public StringStringPair getInversePair(){
            return new StringStringPair(
                    this.second,
                    this.first
            );
        }
        public boolean equals(StringStringPair p){
            return p.first.equals(this.first) && p.second.equals(this.second);
        }
    }
    private static class StringIntPair{
        String first;
        int second;
        public StringIntPair(String first, int second) {
            this.first = first;
            this.second = second;
        }
        public boolean equals(StringIntPair p){
            return p.first.equals(this.first) && p.second == this.second;
        }
    }
    private static class Vector3D{
        int x;
        int y;
        int z;
        public Vector3D(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    private static List<List<Integer>> getCombinations(int[] a, int count){
        List<List<Integer>> ret = new ArrayList<>(0);
        if(a == null || a.length > 64 || count <= 0 || count > a.length){
            return null;
        } else {
            long lim = (1L<<a.length);
            for(long i=0;i<lim;++i){
                List<Integer> poss = getBitPositionList(i);
                if(poss.size() == count){
                    List<Integer> list = new ArrayList<>(0);
                    for(int j=0;j< poss.size();++j){
                        list.add(a[poss.get(j)]);
                    }
                    ret.add(list);
                }
            }
        }
        return ret;
    }

    private static int getBitCount(long n){
        int onCount = 0;
        for(long i=0L;i<64L;++i){
            if((n&(1L<<i)) != 0){
                ++onCount;
            }
        }
        return onCount;
    }
    private static List<Integer> getBitPositionList(long n){
        List<Integer> idxs = new ArrayList<>(0);
        for(long i=0L;i<64L;++i){
            if((n&(1L<<i)) != 0){
                idxs.add(((int) i));
            }
        }
        return idxs;
    }
    private static IntIntPair getIrreducibleFraction(int x, int y){
        int min = (x <= y) ? x : y;
        for(int i=2; i<=min; ++i){
            while (x%i==0 && y%i==0){
                x = x/i;
                y = y/i;
            }
        }
        return new IntIntPair(x,y);
    }

    private static int getDigitSumInBase(int n, int b){
        int sum = 0;
        while (true){
            sum += n%b;
            n = n/b;
            if(n==0){
                break;
            }
        }
        return sum;
    }

    private static List<Integer> getSegmentedPrimes(int start, int end){

        if(start > end){
            int tmp = start;
            start = end;
            end = tmp;
        }

        if(end < 2){
            return new ArrayList<>(0);
        } else {
            if(start < 2){
                start = 2;
            }
        }

        List<Integer> ret = new ArrayList<>(0);
        List<Integer> primes = getPrimes(((int) Math.ceil(Math.sqrt(end))));

        // create and initialize the flag array that
        // will be used a to mark multiples of primes
        boolean[] flags = new boolean[end-start+1];
        for(int i=0; i< flags.length; ++i){
            flags[i] = true;
        }

        for(int i=0;i< primes.size();++i){

            // find the minimum number (>= start) that is multiple of primes.get(i)
            int lLim = (start / primes.get(i)) * primes.get(i);
            while (lLim < start) {
                lLim += primes.get(i);
            }
            if(lLim == 0 || lLim == primes.get(i)){
                lLim = 2*primes.get(i);
            }

            // mark all multiples of primes.get(i) as non-prime
            for (int j = lLim; j <= end; j += primes.get(i)){
                flags[j- start] = false;
            }

        }

        // fill up returning list
        for(int i = start; i<= end; ++i){
            if(flags[i- start]){
                ret.add(i);
            }
        }

        return ret;

    }
    private static List<Integer> getPrimes(int n){

        List<Integer> primes = new ArrayList<>(0);

        boolean[] flags = new boolean[n+1];
        for(int i=0; i<flags.length; ++i){
            flags[i] = true;
        }
        flags[0] = false;
        flags[1] = false;

        for(int i=2;i*i<=n;++i){
            if(flags[i]){
                for(int j = i*i; j <= n; j += i){
                    flags[j] = false;
                }
            }
        }

        for(int i=0, len = n+1; i < len; ++i){
            if(flags[i]){
                primes.add(i);
            }
        }

        return primes;
    }
    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        } else if(n==2){
            return true;
        } else {
            for(int i=2;i<n;++i){
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    private static class Point{
        int x;
        int y;
        int data;
        public Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.data = dist;
        }
    }
    private static boolean isValidPoint(Point p, int maxX, int maxY){
        return (p.x >= 0 && p.y >= 0 && p.x < maxX && p.y < maxY);
    }
    private static Point getGridDist(Point src, Point dest, int maxX, int maxY){

        int[] offsetX = {-1, 1, 0,  0, -1,  1, 1, -1};
        int[] offsetY = { 0, 0, 1, -1,  1, -1, 1, -1};

        boolean[][] visited = new boolean[maxY][maxX];
        for(int i=0;i<maxY; ++i){
            for(int j=0;j<maxX; ++j){
                visited[i][j] = false;
            }
        }

        Queue<Point> Q = new LinkedList<Point>();
        Q.add(src);
        visited[src.y][src.x] = true;

        while (!Q.isEmpty()){
            Point head = Q.poll();
            if(head.x == dest.x && head.y == dest.y){
                return head;
            } else {
                for(int i=0;i<8; ++i){
                    Point child = new Point(head.x+offsetX[i], head.y+offsetY[i], head.data+1);
                    if(isValidPoint(child, 8,8) && !visited[child.y][child.x]){
                        visited[child.y][child.x] = true;
                        Q.add(child);
                    }
                }
            }
        }

        return null;

    }

    private static void displayArray(int[] A, String header){
        System.out.println(header);
        for (int i=0;i<A.length; ++i){
            System.out.println(A[i]);
        }
    }
    private static void displayList(List<Integer> L, String header){
        System.out.println(header);
        for (int i=0;i<L.size(); ++i){
            System.out.println(L.get(i));
        }
    }

    private static void swap(boolean[] arr, int i1, int i2){
        boolean tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
    private static void swap(int[] arr, int i1, int i2){
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }

    private static int getMaxIndex(int[] a){
        int MAX = Integer.MIN_VALUE;
        int ret = 0;
        for(int i=0;i<a.length;++i){
            if(a[i] >= MAX){
                MAX = a[i];
                ret = i;
            }
        }
        return ret;
    }
    private static int getSum(int[] a){
        int sum = 0;
        for(int i=0; i<a.length;++i){
            sum += a[i];
        }
        return sum;
    }

    private static String LcsNaive(String s1, String s2){
        StringBuilder builder = new StringBuilder(0);
        String b = s1.length() >= s2.length() ? s1 : s2;
        String s = s1.length() < s2.length() ? s1 : s2;
        int current = -1;
        for(int i=0;i<s.length();++i){
            for(int j=current+1; j<b.length();++j){
                if(s.charAt(i) == b.charAt(j)){
                    builder.append(b.charAt(j));
                    current = j;
                    break;
                }
            }
        }
        return (builder.length() > 0) ? builder.toString() : null;
    }
    private static StringIntPair LcsClassic(String s1, String s2){
        int[][] dynamic= new int[s1.length()+1][s2.length()+1];
        for(int i=0, sr = s1.length()+1;i<sr; ++i){
            for(int j=0, sc = s2.length()+1; j<sc;++j){
                dynamic[i][j] = 0;
            }
        }
        for(int i=1, sr = s1.length()+1;i<sr; ++i){
            for(int j=1, sc = s2.length()+1; j<sc;++j){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dynamic[i][j] = dynamic[i-1][j-1] + 1;
                } else {
                    dynamic[i][j] = Math.max(dynamic[i-1][j], dynamic[i][j-1]);
                }
            }
        }
        StringBuilder b = new StringBuilder(0);
        int y = s1.length();
        int x = s2.length();
        while (x > 0 && y > 0){
            if(s1.charAt(y-1) == s2.charAt(x-1)){
                b.append(s1.charAt(y-1));
                --x;
                --y;
            } else if(dynamic[y-1][x] > dynamic[y][x-1]){
                --y;
            } else {
                --x;
            }
        }
        return new StringIntPair(b.reverse().toString(), dynamic[y][x]);
    }

    private static void reverse(int[] original){
        int len = original.length;
        for(int i=0, j=len-1; i<=j;++i,--j){
            swap(original, i,j);
        }
    }

    private static int getNthFib(int n){
        if(n <= 1){
            return 1;
        } else {
            int x = 1;
            int y = 1;
            for(int i=2;i<=n;++i){
                int tmp = y;
                y = x+y;
                x = tmp;
            }
            return y;
        }
    }

}
