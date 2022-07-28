import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;

public class CF92B {
    public static void main(String[] args) {
        FastReader input = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        String s = input.nextLine();
        char[] arr = s.toCharArray();

        int i = arr.length-1;
        int ans = 0;
        while (i >= 0){
            if(arr[i] == '0'){
                ans++;
                i--;
            }else{
                if(i == 0){
                    break;
                }
                ans++;
                arr[i] = '0';
                int j = i-1;
                while (j >= 0 && arr[j] == '1'){
                    arr[j] = '0';
                    j--;
                }
                if(j < 0){
                    ans += (i+1);
                    break;
                }else{
                    arr[j] = '1';
                    ans += (i - j);
                    i = j;
                }
            }
        }
        System.out.println(ans);

        // ****If sorting is required, use ArrayList
        // *** If string concatenation is required, use StringBuffer
        // ** check for overflow
        // ** Check for case with min value
        // ** check for case with max value

        pw.flush();
        pw.close();
    }

    static void sort(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : arr)
            list.add(i);
        Collections.sort(list);
        for(int i = 0;i < list.size();i++){
            arr[i] = list.get(i);
        }
        return;
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

