import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair; public class Main{     static void sort(int a[])    {        Random ran = new Random();        for (int i = 0; i < a.length; i++) {            int r = ran.nextInt(a.length);            int temp = a[r];            a[r] = a[i];            a[i] = temp;        }         Arrays.sort(a);    }    static int a[];    static int last=0;    public static void main(String[] args) throws IOException    {        Scanner input = new Scanner(System.in);        int n = input.nextInt();        a = new int[n];        int max = Integer.MIN_VALUE;        for (int i = 0; i < n; i++) {            a[i] = input.nextInt();            max =Math.max(max, a[i]);        }        int temp=0;        StringBuilder ans = new StringBuilder();               while(check())        {                            if(temp==0)            {                         ans.append(road1());                                temp=++temp%2;            }            else            {                 ans.append(road2());                temp = ++temp%2;            }                    }        System.out.println(ans);            }     private static String road1()    {        String s = "";        for (int i = 0; i < a.length; i++) {            if(a[i]>0&&last==0)            {                s+="P";                              a[i]--;                last=1;            }            else                last=0;           if(i+1<a.length)           {                 s+="R";           }                                    }        return s;    }     private static String road2()    {        String s = "";        for (int i = a.length-1; i >=0; i--) {            if(a[i]>0&&last==0)            {                s+="P";               last=1;                a[i]--;            }            else                last=0;             if(i-1>=0)               s+="L";        }        return s;    }     private static boolean check()    {        boolean send = false;        for (int i = 0; i < a.length; i++) {            if(a[i]>0)            {                send=true;                break;            }        }        return send;    }}