import java.io.*;import java.util.HashMap;public class sol {    public static void main (String[] args) throws IOException{        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        int n = Integer.parseInt(br.readLine());        String s = br.readLine();        String str[] = s.trim().split("\\s+");        int a[] = new int[str.length];        for (int i = 0; i < str.length; i++) {            a[i] = Integer.parseInt(str[i]);        }        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();        int t = 1;        for (int i = 0; i < a.length; i++) {            data.put(a[i], t);            t++;        }        t = 1;        for (int i = 0; i < a.length; i++){            System.out.print(data.get(t) + " ");            t++;        }    }}
