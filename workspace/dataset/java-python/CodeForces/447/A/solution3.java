import com.sun.org.apache.bcel.internal.generic.AALOAD;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }     public static void main(String[] args) throws IOException    {         Scanner input = new Scanner(System.in);         int n,b;        b =input.nextInt();        n = input.nextInt();        HashMap<Integer,Integer> map = new HashMap<>();        for (int i = 0; i < n; i++) {            int value = input.nextInt()%b;            if(map.containsKey(value))            {                System.out.println(i+1);                return;            }else            {                map.put(value,1);            }        }        System.out.println("-1");    } }