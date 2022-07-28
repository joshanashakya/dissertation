import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class PracticeProblem
{
    public static FastReader in = new FastReader();
    public static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args)
    {
        solve();
        out.close();
    }

    public static void solve()
    {
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        int min = Integer.MAX_VALUE;

        List<Integer> bin = new ArrayList<>();

        for (int i = n - 1; i > -1; i--)
        {
            if (arr[i] <= min)
            {
                answer[i] = -1;
                min = arr[i];
                bin.add(i);
            }
            else
            {
                // Binary search for the last walrus that is less than this one
                int furthest = Integer.MIN_VALUE;

                int l = 0;
                int r = bin.size() - 1;

                while (l <= r)
                {
                    int mid = l + (r - l) / 2;
                    if (arr[bin.get(mid)] < arr[i])
                    {
                        furthest = bin.get(mid);
                        r = mid - 1;
                    }
                    else
                    {
                        l = mid + 1;
                    }
                }
                answer[i] = furthest - i - 1;
            }

        }

        for (int i : answer)
            out.print(i + " ");
        out.println();

    }

    /*
     * This FastReader code is taken from GeeksForGeeks.com
     * https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
     *
     * The article was written by Rishabh Mahrsee
     */
    public static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
