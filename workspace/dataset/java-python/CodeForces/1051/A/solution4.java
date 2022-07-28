//package main; import java.io.*;import java.util.*;import java.math.BigInteger; public final class Main {    BufferedReader br;    StringTokenizer stk;        public static void main(String[] args) throws Exception {        new Main().run();    }        {        stk = null;        br = new BufferedReader(new InputStreamReader(System.in));    }        long mod = 998244353;    StringBuilder res = new StringBuilder(1000005);    void run() throws Exception {        int t = ni();        while(t-- > 0) {            char[] pass = nt().toCharArray();            int n = pass.length;                        int lower, upper, number;            lower = upper = number = 0;            for(char c : pass) {                if(c >= 'a' && c <= 'z')                    lower++;                else if(c >= 'A' && c <= 'Z')                    upper++;                else                    number++;            }                        if(lower > 0 && upper > 0 && number > 0) {                res.append(new String(pass)).append("\n");            } else {                if(lower == 0) {                    for(int i = 0; i < n; i++) {                        if(pass[i] >= 'A' && pass[i] <= 'Z' && upper > 1) {                            pass[i] = 'a';                            upper--;                            break;                        } else if(pass[i] >= '0' && pass[i] <= '9' && number > 1) {                            pass[i] = 'a';                            number--;                            break;                        }                    }                }                if(upper == 0) {                    for(int i = 0; i < n; i++) {                        if(pass[i] >= 'a' && pass[i] <= 'z' && lower > 1) {                            pass[i] = 'A';                            lower--;                            break;                        } else if(pass[i] >= '0' && pass[i] <= '9' && number > 1) {                            pass[i] = 'A';                            number--;                            break;                        }                    }                }                if(number == 0) {                    for(int i = 0; i < n; i++) {                        if(pass[i] >= 'A' && pass[i] <= 'Z' && upper > 1) {                            pass[i] = '0';                            upper--;                            break;                        } else if(pass[i] >= 'a' && pass[i] <= 'z' && lower > 1) {                            pass[i] = '0';                            number--;                            break;                        }                    }                }                res.append(new String(pass)).append("\n");            }        }        System.out.print(res);    }        //Reader & Writer    String nextToken() throws Exception {        if (stk == null || !stk.hasMoreTokens())            stk = new StringTokenizer(br.readLine(), " ");        return stk.nextToken();    }     String nt() throws Exception {        return nextToken();    }     int ni() throws Exception {        return Integer.parseInt(nextToken());    }     long nl() throws Exception {        return Long.parseLong(nextToken());    }        double nd() throws Exception {        return Double.parseDouble(nextToken());    }        //Some Misc methods    int get(int l, int r, int[] a) {        return l == 0 ? a[r] : a[r] - a[l - 1];    }        void shuffle(int[] a) {        Random r = new Random();        for(int i = 0; i < a.length; i++) {            int idx = r.nextInt(a.length);            int temp = a[i];            a[i] = a[idx];            a[idx] = temp;        }    }        void reverse(int[] a) {        for(int i = 0, j = a.length - 1; i < j; i++, j--) {            int temp = a[i];            a[i] = a[j];            a[j] = temp;        }    }}
