//created by Whiplash99import java.io.*;import java.util.*;public class B{    private static long sum(long N)    {        long s=0;        while (N>0)        {            s+=N%10;            N/=10;        }        return s;    }    public static void main(String[] args) throws Exception    {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         int i;         long N=Long.parseLong(br.readLine().trim());        char[] str=(N+"").toCharArray();        int len=str.length-1;         long num1=0;        for(i=0;i<len;i++) num1=num1*10+9;         String str2=(num1==0)?"":(num1+"");        str2=(char)(str[0]-1)+str2;         num1=Long.parseLong(str2);        System.out.println(sum(num1)+sum(N-num1));    }}