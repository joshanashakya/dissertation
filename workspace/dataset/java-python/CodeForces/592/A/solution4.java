import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;import java.util.StringTokenizer; public class CF592A {    public static void main(String[] args) {        FastReader input = new FastReader();        PrintWriter pw = new PrintWriter(System.out);         char[][] table = new char[9][9];         for(int i = 1;i <= 8;i++){            String s = input.nextLine();            for(int j = 0;j < s.length();j++){                table[i][j+1] = s.charAt(j);            }        }         int minA = Integer.MAX_VALUE;        int minB = Integer.MAX_VALUE;         for(int i = 1;i <= 8;i++){            for(int j = 1;j <= 8;j++){                if(table[i][j] == 'W'){                    int moves = 0;                    boolean con = true;                    int row = i;                    while ((row-1) >= 1){                        row--;                        moves++;                        if(table[row][j] == 'B'){                            con = false;                            break;                        }                    }                    if(con){                        minA = Math.min(minA,moves);                    }                }                 else if(table[i][j] == 'B'){                    int moves = 0;                    boolean con = true;                    int row = i;                    while ((row + 1) <= 8){                        row++;                        moves++;                        if(table[row][j] == 'W'){                            con = false;                            break;                        }                    }                    if(con){                        minB = Math.min(minB,moves);                    }                }             }        }         if(minA == minB){            pw.println("A");        }        else{            if(minA < minB){                pw.println("A");            }            else{                pw.println("B");            }        }          // ****If sorting is required, use ArrayList        pw.flush();        pw.close();    }    static class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new                    InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}
