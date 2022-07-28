import java.io.*;import java.util.*; public class Main {    static PrintWriter pw;    static Scanner sc;    static long ceildiv(long x, long y) { return y==0?inf:(x+y-1)/y; }    static int mod(long x, int m) { return (int)((x%m+m)%m); }    static void put(TreeMap<Integer, Integer> map, Integer p){if(map.containsKey(p)) map.replace(p, map.get(p)+1); else map.put(p, 1); }    static void rem(TreeMap<Integer, Integer> map, Integer p){ if(map.get(p)==1) map.remove(p);else map.replace(p, map.get(p)-1); }    static void printf(double x, int dig){ String s="%."+dig+"f"; pw.printf(s, x); }    static long gcd(long x, long y) {return y==0?x:gcd(y, x%y);}    static int Int(boolean x){ return x?1:0; }    static final int inf=(int)1e9, mod=inf+7;    static boolean[] visit;    static final double r2=Math.sqrt(2), eps=1e-7;    public static void main(String[] args) throws IOException {        sc = new Scanner(System.in);        pw=new PrintWriter(System.out);        point st=new point(sc.nextInt(), sc.nextInt()), end=new point(sc.nextInt(), sc.nextInt());        segment path=new segment(st, end);        int n=sc.nextInt();        int ans=0;        for(int i=0; i<n; i++){            int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();            ans+=path.intersect(new segment(a, b, c))?1:0;        }        pw.println(ans);        pw.close();    }    static class point{        double x, y;        public point(double a, double b){            x=a;            y=b;        }        public String toString(){            return x+" "+y;        }    }     static class segment{        point st, end;        double x, y, c;        public segment(point st, point end){            this.st=st;            this.end=end;            double dx=end.x-st.x, dy=end.y-st.y;            double m;            if(Math.abs(dx)<eps)                m=inf;            else                m=dy/dx;            double b=st.y-(m*st.x);            if(m==inf){                x=1;                y=0;                c=-st.x;            }else{                x=-m;                y=1;                c=-b;            }        }        public segment(int a, int b, int z){            x=a; y=b; c=z;            if(y==0){                st=new point(-c, -1e6);                end=new point(-c, 1e6);            }else if(zero(x/y)){                st=new point(-1e6, -c);                end=new point(1e6, -c);            }else{                double m=-x/y;                if(m>1){                    st=new point(-1e6/m, -1e6);                    end=new point(1e6/m, 1e6);                }else{                    st=new point(-1e6, -1e6*m);                    end=new point(1e6, 1e6*m);                }            }        }        public boolean intersect(segment s){            double m1=s.y==0?inf:s.x/s.y, m2=y==0?inf:x/y;            if(Math.abs(m1-m2)<eps)                return Math.abs(s.c-c)<eps;            double a,b, r;            if(!zero(s.x) && !zero(s.y) && !zero(x) && !zero(y)){                r=(s.y/y);                a=(c*r-s.c)/(s.x-x*r);                r=s.x/x;                b=(c*r-s.c)/(s.y-y*r);            }else{                if(!zero(s.y) && !zero(y)){                    r=(s.y/y);                    a=(c*r-s.c)/(s.x-x*r);                    b=zero(s.x)?-s.c/s.y:-c/y;                }else if(!zero(s.x) && !zero(x)){                    r=s.x/x;                    b=(c*r-s.c)/(s.y-y*r);                    a=zero(s.y)?-s.c/s.x:-c/x;                }else{                    if(y==0){                        a=-c/x;                        b=-s.c/s.y;                    }else{                        a=-s.c/s.x;                        b=-c/y;                    }                }            }            return inSeg(a, b, this);        }        public String toString(){            return x+" "+y+" "+c;        }        public boolean zero(double x){            return Math.abs(x)<eps;        }        public boolean inSeg(double x, double y, segment s){            return validX(x, s) && validY(y, s);        }        public boolean validX(double x, segment s){            if(Math.abs(x-s.st.x)<eps || Math.abs(x-s.end.x)<eps)                return true;            return x>Math.min(s.st.x, s.end.x) && x<Math.max(s.st.x, s.end.x);        }        public boolean validY(double y, segment s){            if(Math.abs(y-s.st.y)<eps || Math.abs(y-s.end.y)<eps)                return true;            return y>Math.min(s.st.y, s.end.y) && y<Math.max(s.st.y, s.end.y);        }    }    static void printArr(int[] arr) {        for (int i = 0; i < arr.length - 1; i++)            pw.print(arr[i] + " ");        pw.println(arr[arr.length - 1]);    }    static void printArr(long[] arr) {        for (int i = 0; i < arr.length - 1; i++)            pw.print(arr[i] + " ");        pw.println(arr[arr.length - 1]);    }    static void printArr(Integer[] arr) {        for (int i = 0; i < arr.length; i++)            pw.print(arr[i] + " ");        pw.println();    }    static void printArr(char[] arr) {        for (int i = 0; i < arr.length; i++)            pw.print(arr[i]==0? '1': arr[i]);        pw.println();    }    static void printArr(ArrayList<Integer> list) {        for (int i = 0; i < list.size(); i++)            pw.print(list.get(i)+" ");        pw.println();    }    static class Scanner {        StringTokenizer st;        BufferedReader br;        public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public Scanner(FileReader r) {            br = new BufferedReader(r);        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            return Double.parseDouble(next());        }        public int[] nextDigits() throws IOException{            String s=nextLine();            int[] arr=new int[s.length()];            for(int i=0; i<arr.length; i++)                arr[i]=s.charAt(i)-'0';            return arr;        }        public int[] nextArr(int n) throws IOException {            int[] arr = new int[n];            for (int i = 0; i < arr.length; i++)                arr[i] = nextInt();            return arr;        }        public Integer[] nextsort(int n) throws IOException{            Integer[] arr=new Integer[n];            for(int i=0; i<n; i++)                arr[i]=nextInt();            return arr;        }        public Pair nextPair() throws IOException{            return new Pair(nextInt(), nextInt());        }        public Pair[] nextPairArr(int n) throws IOException{            Pair[] arr=new Pair[n];            for(int i=0; i<n; i++)                arr[i]=nextPair();            return arr;        }        public boolean ready() throws IOException {            return br.ready();        }    }    static class Pair implements Comparable<Pair>{        int x;        int y;        public Pair(int x, int y) {            this.x=x;            this.y=y;        }        public int hashCode() {            return (this.x*1000+this.y);        }        public int compareTo(Pair p){            return x-p.x;        }        public boolean equals(Object obj) {            if (obj == null) {                return false;            }            if (this.getClass() != obj.getClass()) {                return false;            }            Pair p = (Pair) obj;            return this.x==p.x && this.y==p.y;        }        public Pair clone(){            return new Pair(x, y);        }        public String toString(){            return this.x+" "+this.y;        }        public void add(Pair p){            x+=p.x;            y+=p.y;        }    }    static class Union{        int[] rep, size;        int sets;        public Union(int n){            rep=new int[n];            size=new int[n];            sets=n;            for(int i=0; i<n; i++){                rep[i]=i;                size[i]=1;            }        }        public void join(int x, int y){            int a=getSet(x), b=getSet(y);            if(a==b){                return;            }            sets--;            if(size[a]>size[b]){                rep[b]=a;                size[a]+=size[b];            }else{                rep[a]=b;                size[b]+=size[a];            }        }        public int getSet(int x){            if(rep[x]==x)                return x;            return rep[x]=getSet(rep[x]);        }    }}			 	 			 	 	 	  				 		   			
