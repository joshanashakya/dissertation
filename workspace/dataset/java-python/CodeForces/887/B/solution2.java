import java.io.*;import java.util.*;  public class Solution{        public static void main(String[] args) throws Exception{        int n = in.readInt();        int[][] cube = new int[3][6];        for(int i = 0; i < 3; i++){            Arrays.fill(cube[i], -1);        }        for(int i = 0; i < n; i++){            cube[i] = in.readA();            Arrays.sort(cube[i]);        }                int[] digit = new int[10];        for(int i = 0; i < n; i++){            for(int j = 0; j < 6; j++){                digit[cube[i][j]]++;            }        }        for(int i = 1; i < 100; i++){            if(!check(i, digit, cube)){                System.out.println(i-1);                return;            }        }    }    public static boolean check(int x, int[] digit, int[][] cube){        int t = x, c = 0;        while(x>0){            c++;            x /= 10;        }        x = t;                if(c == 1)  return digit[x]>0;        else {            int d10 = x/10, d1=x%10;            for(int i = 1; i <= 3; i++){                for(int j = i+1; j <= 3; j++){                    if((Arrays.binarySearch(cube[i-1], d10) > -1 && Arrays.binarySearch(cube[j-1], d1) > -1)                     || (Arrays.binarySearch(cube[i-1], d1) > -1 && Arrays.binarySearch(cube[j-1], d10) > -1)){                        // if(x == 10){                        //     System.out.println(i+" "+j);                        //     System.out.println((Arrays.binarySearch(cube[i-1], d10) > -1 && Arrays.binarySearch(cube[j-1], d1) > -1));                        //     System.out.println((Arrays.binarySearch(cube[i-1], d1) > -1 && Arrays.binarySearch(cube[j-1], d10) > -1));                        // }                        return true;                    }                }            }        }         return false;    }     static Inputer in;    static {        in = new Inputer();    }     static class Inputer{        BufferedReader br;        Inputer(){            try{                br = new BufferedReader(new InputStreamReader(System.in));            }            catch(Exception e){}        }        public int readInt() throws Exception{            return Integer.parseInt(readLine());        }        public long readLong() throws Exception{            return Long.parseLong(readLine());        }        public int[] readA(String delim) throws Exception{            String[] s = readLine().split(delim);            int[] A = new int[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Integer.parseInt(s[i]);            return A;        }        public int[] readA() throws Exception{            String[] s = readLine().split("\\s+");            int[] A = new int[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Integer.parseInt(s[i]);            return A;        }        public long[] readLA() throws Exception{            String[] s = readLine().split("\\s+");            long[] A = new long[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Long.parseLong(s[i]);            return A;        }        public String readLine() throws Exception{            return br.readLine();        }        public int[] copyA(int[] A){            int[] B = new int[A.length];            for(int i= 0 ; i < A.length; i++)                B[i] = A[i];            return B;        }    }    static void shuffle(int[] A){        int n = A.length;        Random rand = new Random();        for(int t = 0; t < A.length; t++){            int i1 = rand.nextInt(n);            int i2 = rand.nextInt(n);            int tmp = A[i1];            A[i1] = A[i2];            A[i2] = tmp;        }    }}
