import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }        public static void main(String[] args) throws IOException    {       Scanner input = new  Scanner(System.in);       long value[] = {6,2,5,5,4,5,6,3,7,6};     int a = input.nextInt();     int b = input.nextInt();     long ans  = 0;        for (int i = a; i <=b; i++) {            String s = i+"";            for (int j = 0; j < s.length(); j++) {                ans+=(value[s.charAt(j)-'0']);            }        }        System.out.println(ans);    }           }
