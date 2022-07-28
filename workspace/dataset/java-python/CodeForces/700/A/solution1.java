import java.util.*;import java.io.*; public class Main {    public static void main(String[] args) throws IOException {        FastScanner in = new FastScanner(System.in);        PrintWriter out = new PrintWriter(System.out);        new Main().run(in, out);        out.close();    }     public static long mod = 17352642619633L;      int N, L, V1, V2, K;    double busspeed;    double personspeed;     public static double eps = 1e-11;    void run(FastScanner in, PrintWriter out) {         N = in.nextInt(); // num people        L = in.nextInt(); // length        personspeed = in.nextInt(); // speed of people        busspeed = in.nextInt(); // speed of bus, V2 > V1        K = in.nextInt(); // size of bus         // binary search        double lo = 0;        double hi = L/personspeed;         // while (hi-lo > eps) {        //     double m = (hi+lo)/2;        for (int rep = 0; rep <= 80; rep++) {            double m = (hi+lo)/2;            if (can(m)) {                hi = m;            } else {                lo = m+eps;            }        }        // System.out.println(can(4.0));         out.println(lo);    }     boolean can(double t) {          double buspos = 0;        double personpos = 0;        double time = 0;         // bring them as far as possible        // and they can walk on their own        for (int tripnum = 0; tripnum*K < N; tripnum++) {             // when will bus meet the people            // bus should be in front of the people            // personpos + t*personspeed = buspos - t*busspeed            // t*(personspeed + busspeed) = buspos - personspeed            // t = (buspos - personpos) / (personspeed + busspeed)             double meetdelta = (buspos - personpos) / (personspeed + busspeed);            double meetpos = buspos - meetdelta * busspeed;             // how far do i have to go such that they will be able to walk on their own            // within t time            // meetpos + t1*busspeed + t2*personspeed = L            // (t1 + t2) = remaining time [our budget]            // meetpos + t1 * busspeed + (t-t1)*personspeed = L            // t1*busspeed + t*personspeed - t1*personspeed = L-meetpos            // t1(busspeed - personspeed) = L-meetpos - t*personspeed            // t1 = (L-meetpos -t*personspeed)/(busspeed-personspeed)            // t1 = bustravel time, t2 = person travel time             if (t-time-meetdelta < 0) return false;            double busTravelTime = (L-meetpos-(t-time-meetdelta)*personspeed) / (busspeed - personspeed);             // System.out.println(t + " " +meetdelta + " " + meetpos + " "+ busTravelTime);            // System.out.println(meetpos + " " + personpos + " " + buspos);            // System.out.println(Math.abs(meetdelta-eps) > 0);            // System.out.println();             // System.out.println(time);            // if (meetdelta < 0 || busTravelTime < 0) return false;            // if (Math.abs(meetdelta-eps) > 0 && meetdelta < 0) return false;            // if (Math.abs(busTravelTime-eps) > 0 && busTravelTime < 0) return false;             buspos = meetpos + busTravelTime * busspeed;            personpos = meetpos + busTravelTime * personspeed;            time += meetdelta + busTravelTime;            if (time > t) return false;        }         return true;    }        static class FastScanner {        BufferedReader br;        StringTokenizer st;         public FastScanner(InputStream in) {            br = new BufferedReader(new InputStreamReader(in));            st = null;        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}