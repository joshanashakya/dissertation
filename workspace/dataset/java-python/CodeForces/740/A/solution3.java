import com.sun.org.apache.bcel.internal.generic.AALOAD;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     public static void main(String[] args) throws IOException    {         Scanner input = new Scanner(System.in);        long n,a,b,c;        n = input.nextLong();//Notebooks        a = input.nextLong();//1        b = input.nextLong();//2        c = input.nextLong();//3       if(n%4==0)       {           System.out.println(0);       }else if(n%4==1)       {           System.out.println(Math.min(3*a, Math.min(a+b, c)));                  }       else if(n%4==2)       {           System.out.println(Math.min(2*a, Math.min(b, c*2)));       }       else if(n%4==3)       {                      System.out.println(Math.min(a, Math.min(b+c, 3*c)));       }    } }
