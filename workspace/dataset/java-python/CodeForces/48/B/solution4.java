import java.nio.file.Paths;import  java.util.*;import  java.io.*;public class Main {//================================================//Константы.......................................//================================================static final long N = (long) (1e5 + 10);static final long M = (long) (1e7 + 1000);static final long mod = (long) (1e9 + 7);static final long INF = (long) (1e18);static final long inf = (long) (-1e18);//================================================//================================================    // O(long(n))    static long binpow(long a, long n){        if (n == 0) return 1;        if (n % 2 == 1){            return binpow(a, n-1) * a;        }else {            long b = binpow(a, n/2);            return b * b;        }    }    // O(log(min(a,b))    static long gcd(long a, long b){        if (b == 0) return a;        else return gcd(b, a % b);    }//===============================================//===============================================    void run(){        /*try {            Scanner in = new Scanner(Paths.get("symposium.in"), "UTF-8");            PrintWriter out = new PrintWriter("symposium.out", "UTF-8");            slove(in, out);        }catch (IOException e){            throw new Error(e);         }*/         Scanner in = new Scanner(System.in);        PrintWriter out = new PrintWriter(System.out);        slove(in, out);    }//=================================================// РЕШЕНИЕ .. .. .. . .. .. .. .. ... ... .... .. .//=================================================    public  static int SumOF(int[][] arr, int x1, int x2, int y1, int y2){        int sum = 0;         for (int i = x1; i <= x2; i++){            for (int j = y1; j <= y2; j++){                sum+=arr[i][j];            }        }        return sum;    }     void  slove(Scanner in, PrintWriter out){        int n = in.nextInt();        int m = in.nextInt();        int[][] arr = new int[n][m];        for (int i = 0; i < n; i++){            for (int j = 0; j < m; j++){                arr[i][j] = in.nextInt();            }        }        int a = in.nextInt();        int b = in.nextInt();        int minAxB = Integer.MAX_VALUE;        int minBxA = Integer.MAX_VALUE;         for (int i = 0; i + a - 1 < n; i++){            for (int j = 0; j + b -1 < m; j++){                //System.out.println(i + " " + j + " --- "+ (i+a-1) + " " + (j +b-1));                minAxB = Math.min(minAxB, SumOF(arr, i, i+a-1, j, j + b -1));            }        }          for (int i = 0; i + b - 1 < n; i++){            for (int j = 0; j + a -1 < m; j++){                //System.out.println(i + " " + j + " --- "+ (i+b-1) + " " + (j +a-1));                minAxB = Math.min(minAxB, SumOF(arr, i, i+b-1, j, j + a -1));            }        }        System.out.println(Math.min(minBxA, minAxB));         }//================================================//================================================    public static void main(String[] args) {        new Main().run();    }}