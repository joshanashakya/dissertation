/*⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀⡏⠀⠀Y⠀⠀⢷⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀⠀A⠀⠀ ⡇⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀S⠀  ⡇⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀H⠀⠀ ⡇⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀⠀⠀⠀⡼⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀⣿⣿⣧⣀⣿………⣀⣰⣏⣘⣆⣀⠀⠀ */ import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter; // System.out is a PrintStream// import java.util.Arrays;// import java.util.ArrayDeque;// import java.util.ArrayList;// import java.util.Collections;    //  for sorting ArrayList mainly// import java.util.HashMap;// import java.util.HashSet;// import java.util.Random;import java.util.StringTokenizer; public class B1382 {    public static void main(String[] args) throws IOException {        FastScanner scn = new FastScanner();        PrintWriter out = new PrintWriter(System.out);        for (int tc = scn.nextInt(); tc > 0; tc--) {            int N = scn.nextInt();            int[] arr = new int[N];            boolean first = false;            String winner = "";            for (int i = 0; i < N; i++) {                arr[i] = scn.nextInt();                if (arr[i] != 1 && !first) {                    first = true;                    winner = (i & 1) == 0 ? "First" : "Second";                }            }            if (winner.length() == 0) {                out.println((N & 1) == 0 ? "Second" : "First");            } else {                out.println(winner);            }        }        out.close();    }     private static int gcd(int num1, int num2) {        int temp = 0;        while (num2 != 0) {            temp = num1;            num1 = num2;            num2 = temp % num2;        }        return num1;    }     private static int lcm(int num1, int num2) {        return (int)((1L * num1 * num2) / gcd(num1, num2));    }     private static void ruffleSort(int[] arr) {        // int N = arr.length;        // Random rand = new Random();        // for (int i = 0; i < N; i++) {        //     int oi = rand.nextInt(N), temp = arr[i];        //     arr[i] = arr[oi];        //     arr[oi] = temp;        // }        // Arrays.sort(arr);    }     private static class FastScanner {        BufferedReader br;        StringTokenizer st;         FastScanner() {            this.br = new BufferedReader(new InputStreamReader(System.in));            this.st = new StringTokenizer("");        }         String next() {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException err) {                    err.printStackTrace();                }            }            return st.nextToken();        }         String nextLine() {            if (st.hasMoreTokens()) {                return st.nextToken("").trim();            }            try {                return br.readLine().trim();            } catch (IOException err) {                err.printStackTrace();            }            return "";        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }    }}
