import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class Main {    static class FastReader    {   BufferedReader br; StringTokenizer st;        public FastReader(){ br = new BufferedReader(new InputStreamReader(System.in)); }        String next(){while (st == null || !st.hasMoreElements()){ try{st = new StringTokenizer(br.readLine()); }        catch(IOException e){e.printStackTrace();}}return st.nextToken();}        int nextInt() { return Integer.parseInt(next()); }        long nextLong() { return Long.parseLong(next()); }        double nextDouble() { return Double.parseDouble(next()); }        String nextLine(){ String str = ""; try{ str = br.readLine();}catch (IOException e) { e.printStackTrace(); }  return str;}    }    public static void main(String[] args) {        FastReader scan=new FastReader();        PrintWriter rt=new PrintWriter(System.out);         int y=scan.nextInt();        String s=scan.next(); 	  if(y==1)      {          rt.print("Yes");          rt.close();          return;      }         else {           int arr[] = new int[27];           for (int i = 0; i < s.length(); i++)          {              arr[s.charAt(i) - 97]++;               if(arr[s.charAt(i)-97]==2)              {                  rt.print("YES");                  rt.close();                  return;              }          }      }        rt.print("NO");        rt.close();        return;    }}