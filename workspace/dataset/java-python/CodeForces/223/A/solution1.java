import java.util.*;import java.io.*;import static java.lang.Math.*; public class PracticeProblem{    /*     * This FastReader code is taken from GeeksForGeeks.com     * https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/     *     * The article was written by Rishabh Mahrsee     */    public static class FastReader    {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                    st = new StringTokenizer(br.readLine());                }                catch (IOException  e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }     public static FastReader in = new FastReader();    public static PrintWriter out = new PrintWriter(System.out);     public static void main(String[] args)    {        solve();        out.close();    }     private static void solve()    {        char[] arr = ("|" + in.nextLine() + "|").toCharArray(); // The beginning and end are just dummy characters        int n = arr.length;        int[] numOpen = new int[n];         Stack<Integer> st = new Stack<>();         int i = 0;         while (i < n)        {            int size = st.size();            if (st.size() > 1 && (arr[st.get(size - 2)] == '(' && arr[st.get(size - 1)] == ')' || arr[st.get(size - 2)] == '[' && arr[st.get(size - 1)] == ']'))            {                st.pop();                st.pop();            }            else            {                numOpen[i] = i - 1 >= 0 ? numOpen[i - 1] : 0;                st.push(i);                if (arr[i] == '[')                    numOpen[i]++;                i++;            }        }         int max = -1;        int ansl = -1;        int ansr = -1;         for (int j = 1; j < st.size(); j++)        {            int openCount = numOpen[st.get(j) - 1] - numOpen[st.get(j - 1)];            if (openCount > max)            {                max = openCount;                ansl = st.get(j - 1) + 1;                ansr = st.get(j);            }        }         out.println(max);        out.println(new String(arr).substring(ansl, ansr));    }}
