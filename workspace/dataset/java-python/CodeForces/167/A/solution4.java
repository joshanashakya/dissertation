import java.io.BufferedReader;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; /* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */ /** * * @author Andy Phan */public class p167a {    public static void main(String[] args) {        FS in = new FS(System.in);        PrintWriter out = new PrintWriter(System.out);        int n = in.nextInt();        double a = in.nextInt();        double d = in.nextInt();        double time = 0.0;        while(n --> 0) {            double t = in.nextInt();            double v = in.nextInt();            double curr = 0;            if(v*v/(2.0*a) >= d) {                curr = Math.sqrt(2.0*d/a);            } else {                curr = v/a+(d-v*v/(2.0*a))/v;            }            curr = Math.max(curr+t, time);            out.println(curr);            time = curr;        }        out.close();    }        static class FS {        BufferedReader in;        StringTokenizer t;                public FS(InputStream i) {            in = new BufferedReader(new InputStreamReader(i));        }                public String next() {            try {                while(t == null || !t.hasMoreElements()) {                    t = new StringTokenizer(in.readLine());                }            } catch(Exception e) {}            return t.nextToken();        }                public int nextInt() {            return Integer.parseInt(next());        }    }}