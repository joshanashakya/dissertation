import java.util.*;import java.io.*; public class karen {    public static void main(String[] args){        FastReader in = new FastReader();        PrintWriter out = new PrintWriter(System.out);        String time = in.nextLine();        int[] hours = new int[2];        int[] minutes = new int[2];        int index = 0;        for(int i = 0; i < 5; i++){            if(i < 2) hours[i] = Integer.parseInt(String.valueOf(time.charAt(i)));            else if(i > 2){                minutes[index] = Integer.parseInt(String.valueOf(time.charAt(i)));                index++;            }        }        if(hours[0] == 2 && hours[1] == 3 && minutes[0] >= 3 && minutes[1] >= 3){            String num = String.valueOf(minutes[0]);            num += String.valueOf(minutes[1]);            out.println(60 - Integer.parseInt(num));        }        else {            int ans = 0;            for (int i = 0; i < 10000; i++) {                if (hours[0] == minutes[1] && hours[1] == minutes[0]) break;                else {                    minutes[1]++;                    if (minutes[1] == 10) {                        minutes[1] = 0;                        minutes[0]++;                        if (minutes[0] == 6) {                            minutes[0] = 0;                            hours[1]++;                            if (hours[1] == 10) {                                hours[1] = 0;                                hours[0]++;                                if (hours[0] == 10) hours[0] = 1;                                else if (hours[0] == 20) hours[0] = 2;                            }                        }                    }                    ans++;                }            }            out.println(ans);        }                 out.close();    }     static class FastReader {        BufferedReader br;        StringTokenizer st;         public FastReader()        {            br = new BufferedReader(                    new InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                }                catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() { return Integer.parseInt(next()); }         long nextLong() { return Long.parseLong(next()); }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try {                str = br.readLine();            }            catch (IOException e) {                e.printStackTrace();            }            return str;        }    }}
