import java.io.*;import java.util.*; public class Solution{        public static void main(String[] args) throws Exception{        int[] a = in.readA();        int[] b = in.readA();        int[] c = in.readA();         System.out.println(3);        System.out.println(getCoord(a,b,c));        System.out.println(getCoord(c,a,b));        System.out.println(getCoord(b,c,a));    }    public static String getCoord(int[] a,int[] b,int[] c){        // double m1 = (b[1] - a[1])/(double)(b[0]-a[0]), m2 = (c[1]-a[1])/(double)(c[0]-a[0]);        // System.out.println(m1+","+m2);        // double x, y;        // if(b[0]==a[0]){        //     x = c[0];        //     y = b[1] + m2*(x - b[0]);        // }        // else if(c[0]==a[0]){        //     x = b[0];        //     y = c[1] + m1*(x - c[0]);        // }        // else {        //     x = (1/(m1-m2))*(b[1] - c[1] + m1*c[0] - m2*b[0]);        //     y = (1/(m1-m2))*(m1*m2*(c[0] - b[1]) + m1*b[1] - m2*c[1]);        // }        return (b[0]+c[0]-a[0])+" "+(b[1]+c[1]-a[1]);    }     static Inputer in;    static {        in = new Inputer();    }     static class Inputer{        BufferedReader br;        Inputer(){            try{                br = new BufferedReader(new InputStreamReader(System.in));            }            catch(Exception e){}        }        public int readInt() throws Exception{            return Integer.parseInt(readLine());        }        public long readLong() throws Exception{            return Long.parseLong(readLine());        }        public int[] readA(String delim) throws Exception{            String[] s = readLine().split(delim);            int[] A = new int[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Integer.parseInt(s[i]);            return A;        }        public int[] readA() throws Exception{            String[] s = readLine().split("\\s+");            int[] A = new int[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Integer.parseInt(s[i]);            return A;        }        public long[] readLA() throws Exception{            String[] s = readLine().split("\\s+");            long[] A = new long[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Long.parseLong(s[i]);            return A;        }        public String readLine() throws Exception{            return br.readLine();        }        public int[] copyA(int[] A){            int[] B = new int[A.length];            for(int i= 0 ; i < A.length; i++)                B[i] = A[i];            return B;        }    }    static void shuffle(int[] A){        int n = A.length;        Random rand = new Random();        for(int t = 0; t < A.length; t++){            int i1 = rand.nextInt(n);            int i2 = rand.nextInt(n);            int tmp = A[i1];            A[i1] = A[i2];            A[i2] = tmp;        }    }}
