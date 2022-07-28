//Just for this import java.io.*;import java.util.*;public class Main {    static PrintWriter pw;    static Scanner sc;    static int ceildiv(int x, int y){        return x%y==0? x/y: x/y+1;    }    public static void main(String[] args) throws Exception {        sc = new Scanner(System.in);        pw = new PrintWriter(System.out);        int tc=sc.nextInt();        while(tc-->0){            int n=sc.nextInt(), r=sc.nextInt();            long sum=0l;            Integer[] arr=sc.nextsort(n);            Arrays.sort(arr);            LinkedList<Integer> link= new LinkedList<Integer>();            for(int i=0; i<n; i++)                link.addLast(arr[i]);            int ans=0;            while(!link.isEmpty()){                int x=link.pollLast();                while(!link.isEmpty() && link.getLast()==x)                    link.removeLast();                sum+=r;                while(!link.isEmpty() && link.getFirst()<=sum)                    link.removeFirst();                ans++;            }            pw.println(ans);        }        pw.close();    }    static void printArr(int[] arr){        for(int i=0; i<arr.length-1; i++)            pw.print(arr[i]+" ");        pw.println(arr[arr.length-1]);    }    static void printArr(long[] arr){        for(int i=0; i<arr.length-1; i++)            pw.print(arr[i]+" ");        pw.println(arr[arr.length-1]);    }    static void printArr(Integer[] arr){        for(int i=0; i<arr.length-1; i++)            pw.print(arr[i]+" ");        pw.println(arr[arr.length-1]);    }    static class Scanner {        StringTokenizer st;        BufferedReader br;        public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public Scanner(FileReader r) {            br = new BufferedReader(r);        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            return Double.parseDouble(next());        }         public int[] nextArr(int n) throws IOException {            int[] arr = new int[n];            for (int i = 0; i < arr.length; i++)                arr[i] = nextInt();            return arr;        }        public Integer[] nextsort(int n) throws IOException{            Integer[] arr=new Integer[n];            for(int i=0; i<n; i++)                arr[i]=nextInt();            return arr;        }        public Pair nextPair() throws IOException{            return new Pair(nextInt(), nextInt());        }        public Pair[] nextPairArr(int n, int l) throws IOException{            Pair[] arr=new Pair[n];            if(l==2){                int[] a=nextArr(n), b=nextArr(n);                for(int i=0; i<n; i++)                    arr[i]=new Pair(a[i], b[i]);                return arr;            }            for(int i=0; i<n; i++)                arr[i]=new Pair(nextInt(), nextInt());            return arr;        }        public boolean ready() throws IOException {            return br.ready();        }    }    static class Kad{        long sum;        int max;        public Kad(long x, int y) {            this.sum=x;            this.max=y;        }    }    static class Pair implements Comparable<Pair>{        int x;        int y;        public Pair(int x, int y) {            this.x=x;            this.y=y;        }        public int hashCode() {            return this.x*1000+this.y;        }        public int compareTo(Pair other) {            if(this.x!=other.x)                return this.x-other.x;            return this.y-other.y;        }        public boolean equals(Object obj) {            if (obj == null) {                return false;            }            if (this.getClass() != obj.getClass()) {                return false;            }            Pair p = (Pair) obj;            if(this.x==p.x)                return this.y==p.y;            if(this.x==p.y)                return this.y==p.x;            else                return false;        }        public boolean equal(Pair p){            if(this.x==p.x)                return this.y==p.y;            if(this.x==p.y)                return this.y==p.x;            else                return false;        }    }}