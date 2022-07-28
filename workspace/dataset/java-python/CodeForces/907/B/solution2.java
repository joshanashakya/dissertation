import java.io.*;import java.util.*; public class B_Tic_Tac_Toe{        public static void main(String[] args) throws Exception{        char[][] mat = new char[9][9];        int mx = 0, my = 0;        for(int i = 0; i < 11; i++){            String[] line = in.readLine().split(" ");            if(i == 3 || i == 7)                continue;            for(int j = 0; j < 9; j++){                mat[mx][my++] = line[j/3].charAt(j%3);            }            mx++;            my = 0;        }        int[] xy = in.readA();        int x = xy[0]-1, y = xy[1]-1;         int cx = 3*(x - 3*(x/3)), cy = 3*(y - 3*(y/3));                boolean found = false;        for(int i = cx; i < cx+3; i++){            for(int j = cy; j < cy+3; j++){                if(mat[i][j] == '.'){                    found = true;                    mat[i][j] = '!';                }            }        }        if(!found){            for(int i = 0; i < 9; i++){                for(int j = 0; j < 9; j++){                    if(mat[i][j] == '.')                        mat[i][j] = '!';                }            }        }        mx = 0; my = 0;        for(int i = 0; i < 11; i++){            if(i == 3 || i == 7){                System.out.println();                continue;            }            for(int j = 0; j < 11; j++){                if(j == 3 || j == 7){                    System.out.print(" ");                }                else {                    System.out.print(mat[mx][my++]);                }            }            System.out.println();            mx++;            my=0;        }    }     static Inputer in;    static {        in = new Inputer();    }     static class Inputer{        BufferedReader br;        Inputer(){            try{                br = new BufferedReader(new InputStreamReader(System.in));            }            catch(Exception e){}        }        public int readInt() throws Exception{            return Integer.parseInt(readLine());        }        public long readLong() throws Exception{            return Long.parseLong(readLine());        }        public int[] readA(String delim) throws Exception{            String[] s = readLine().split(delim);            int[] A = new int[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Integer.parseInt(s[i]);            return A;        }        public int[] readA() throws Exception{            String[] s = readLine().split("\\s+");            int[] A = new int[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Integer.parseInt(s[i]);            return A;        }        public long[] readLA() throws Exception{            String[] s = readLine().split("\\s+");            long[] A = new long[s.length];            for(int i = 0; i < s.length; i++)                A[i] = Long.parseLong(s[i]);            return A;        }        public String readLine() throws Exception{            return br.readLine();        }        public int[] copyA(int[] A){            int[] B = new int[A.length];            for(int i= 0 ; i < A.length; i++)                B[i] = A[i];            return B;        }    }    static void shuffle(int[] A){        int n = A.length;        Random rand = new Random();        for(int t = 0; t < A.length; t++){            int i1 = rand.nextInt(n);            int i2 = rand.nextInt(n);            int tmp = A[i1];            A[i1] = A[i2];            A[i2] = tmp;        }    }}
