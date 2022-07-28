//Author: Patel Rag
//Java version "1.8.0_211"
import java.util.*;
import java.io.*;

public class Rextester
{
  static Reader fr;
  static Print log;
  static class Reader
  {
    private byte[] buffer = new byte[1024];
    private int index;
    private InputStream in;
    private int total;
    public Reader()
    {
        in = System.in;
    }
    public Reader(InputStream in)
    {
      this.in = in;
    }
    private int scan() throws IOException
    {
        if(index >= total)
        {
            index = 0;
            total = in.read(buffer);
            if(total <= 0)
            {
              return -1;
            }
        }
        return buffer[index++];
    }
    public final int nextInt() throws IOException
    {
      return (int)nextLong();
    }
    public final long nextLong() throws IOException
    {
        long res = 0;
        int n = scan();
        while(isWhiteSpace(n))
        {
          n = scan();
        }
        int neg = 1;
        if(n == '-')
        {
            neg = -1;
            n = scan();
        }
        while(!isWhiteSpace(n))
        {
            if(n >= '0' && n <= '9')
            {
                res *= 10;
                res += (n - '0');
                n = scan();
            }
            else
            {
              throw new InputMismatchException();
            }
        }
        return neg*res;
    }
    public final double nextDouble() throws IOException
    {
        double doub = 0;
        int n = scan();
        while(isWhiteSpace(n))
        {
          n=scan();
        }
        int neg = 1;
        if(n == '-')
        {
            neg = -1;
            n = scan();
        }
        while(!isWhiteSpace(n) && n != '.')
        {
            if(n >= '0' && n <= '9')
            {
                doub *= 10;
                doub += n-'0';
                n = scan();
            }
            else
            {
              throw new InputMismatchException();
            }
        }
        if(n == '.')
        {
            n = scan();
            double temp = 1;
            while(!isWhiteSpace(n))
            {
                if(n >= '0' && n <= '9')
                {
                    temp/=10;
                    doub += (n-'0')*temp;
                    n = scan();
                }
                else
                {
                  throw new InputMismatchException();
                }
            }
        }
        return neg*doub;
    }
    public final String next() throws IOException
    {
        StringBuilder sb = new StringBuilder();
        int n = scan();
        while(isWhiteSpace(n))
        {
          n = scan();
        }
        while(!isWhiteSpace(n))
        {
            sb.append((char)n);
            n = scan();
        }
        return sb.toString();
    }
    public final String nextLine() throws IOException
    {
      StringBuilder sb = new StringBuilder();
      int n = scan();
      while(isWhiteSpace(n))
      {
        n = scan();
      }
      while(n != '\n' && n != '\r' && n != -1)
      {
        sb.append((char)n);
        n = scan();
      }
      return sb.toString();
    }
    private boolean isWhiteSpace(int n)
    {
        if(n == ' ' || n == '\n'|| n == '\r' || n == '\t'|| n == -1)
        return true;
        return false;
    }
  }
  static class Print
  {
      private final BufferedWriter bw;
      public Print()
      {
          this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
      }
      public void print(Object object)throws IOException
      {
          bw.append(""+object);
      }
      public void println(Object object)throws IOException
      {
          print(object);
          bw.append("\n");
      }
      public void close()throws IOException
      {
          bw.close();
      }
  }
  public static void main(String[] args)
  throws IOException
  {
    fr = new Reader();
    log = new Print();
    int T = fr.nextInt();
    for(int t = 0; t < T; t++) {
      int n = fr.nextInt();
      int k = fr.nextInt();
      String s = fr.nextLine();
      TreeSet<Integer> pos = new TreeSet<>();
      for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '*') {
          pos.add(i);
        }
      }
      if(pos.size() < 3){
        log.println(pos.size());
        continue;
      }
      int first = pos.first();
      int last = pos.last();
      int curr = first;
      int res = 2;
      while(pos.floor(curr + k) != null && pos.floor(curr + k) < last) {
        curr = pos.floor(curr + k);
        res++;
      }
      log.println(res);
    }
    log.close();
  }
  /////////////////////////////////////////////////////////
}
