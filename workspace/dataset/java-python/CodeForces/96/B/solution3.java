import java.util.*;import java.io.*;import java.math.*;

public class First
{
   
   
    public static void process()throws IOException
    {
          ArrayList<Long> list = new ArrayList<Long>();
          TreeSet<Long> set = new TreeSet<Long>();
          list.add(47l);
          list.add(74l);
          int i=0,j=1;
          int current=2;
          while(current<=8)
          {
               for(int k=i;k<=j;k++)
               {
                    long x = (4*(long)Math.pow(10,current+1))+(list.get(k)*10)+7;
                    set.add(x);
               }
               for(int k=i;k<=j;k++)
               {
                    long x = (7*(long)Math.pow(10,current+1))+(list.get(k)*10)+4;
                    set.add(x);
               }
               for(int k=i;k<=j;k++)
               {
                    long x = (list.get(k)*100)+47;
                    set.add(x);
                    x = (list.get(k)*100)+74;
                    set.add(x);
                    x = (47*(long)Math.pow(10,current))+list.get(k);
                    set.add(x);
                     x = (74*(long)Math.pow(10,current))+list.get(k);
                    set.add(x);

               }
               list.addAll(set);
               i=j+1;
               j+=set.size();
               // pn(set);
               set.clear();
               current+=2;  


          }
          int n = ni();
          for(Long x : list)
          {
               // pn(x);
               if(x>=n)
               {
                    pn(x);
                    break;
               }
          }
          // pn(">>>"+list.get(list.size()-1));


    }

   	static AnotherReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc=new AnotherReader();
        boolean oj = true;

    // 	oj = System.getProperty("ONLINE_JUDGE") != null;
    // 	if(!oj) sc=new AnotherReader(100);

    //     long s = System.currentTimeMillis();
        
    
        int t=1;
        while(t-->0)
            process();
        out.flush();
        // if(!oj)
        //     System.out.println(System.currentTimeMillis()-s+"ms");
        System.out.close();  
    }

    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static void pni(Object o){out.println(o);System.out.flush();}
    static int ni()throws IOException{return sc.nextInt();}
    static long nl()throws IOException{return sc.nextLong();}
    static double nd()throws IOException{return sc.nextDouble();}
    static String nln()throws IOException{return sc.nextLine();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
    static boolean multipleTC=false;



/////////////////////////////////////////////////////////////////////////////////////////////////////////

    static class AnotherReader{BufferedReader br; StringTokenizer st;
    AnotherReader()throws FileNotFoundException{
    br=new BufferedReader(new InputStreamReader(System.in));}
    AnotherReader(int a)throws FileNotFoundException{
    br = new BufferedReader(new FileReader("input.txt"));}
    String next()throws IOException{
    while (st == null || !st.hasMoreElements()) {try{
    st = new StringTokenizer(br.readLine());}
    catch (IOException  e){ e.printStackTrace(); }}
    return st.nextToken(); } int nextInt() throws IOException{
    return Integer.parseInt(next());}
    long nextLong() throws IOException
    {return Long.parseLong(next());}
    double nextDouble()throws IOException { return Double.parseDouble(next()); }
    String nextLine() throws IOException{ String str = ""; try{
    str = br.readLine();} catch (IOException e){
    e.printStackTrace();} return str;}}
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
}



