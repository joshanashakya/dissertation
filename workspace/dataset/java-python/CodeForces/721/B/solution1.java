import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.*; public class Main{     public static void main(String[] args) throws IOException    {         FastScanner input = new FastScanner();        TreeSet<String> set = new TreeSet<>();         int n, k;         ArrayList<String> a = new ArrayList<>();        n = input.nextInt();        k = input.nextInt();        for (int i = 0; i < n; i++) {            a.add(input.next());        }        String realPass = input.next();        Collections.sort(a, new Comparator<String>()        {            @Override            public int compare(String t, String t1)            {                return t.length() - t1.length();            }         });         int count = 0;        int smalltime = 0;        for (int i = 0; i < n; i++) {             if (realPass.length() > a.get(i).length()) {                count++;                smalltime++;                if (count == k) {                    smalltime += 5;                    count=0;                }            } else if (realPass.length() == a.get(i).length()) {                smalltime++;                break;            }         }               count = 0;         for (int i = 0; i < n; i++) {            if (a.get(i).length() <= realPass.length()) {                count++;            }        }//        System.out.println("count->" + count);        int bigtime = (((count - 1) / k) * 5);//        System.out.println(bigtime);        bigtime += (((count) / k) * k);//        System.out.println(bigtime);        bigtime += ((count) % k);                System.out.println(smalltime+" "+bigtime);     }     static class FastScanner    {         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next()        {            while (!st.hasMoreTokens()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {             return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine() throws IOException        {            return br.readLine();        }    } }
