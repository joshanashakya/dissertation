//created by Whiplash99import java.io.*;import java.util.*;public class A{    private static boolean check(char[] str)    {        ArrayDeque<Integer> stack=new ArrayDeque<>();        for(char ch:str)        {            if(ch=='(') stack.push(1);            else            {                if(!stack.isEmpty()) stack.pop();                else return false;            }        }        return stack.isEmpty();    }    private static boolean solve(int i, int mask, char[] str, char[] str2)    {        if(i==3)        {            int a=mask%2; mask/=2;            int b=mask%2; mask/=2;            int c=mask%2; mask/=2;             for(int j=0;j<str.length;j++)            {                if(str[j]=='A') str2[j]=(a==1)?'(':')';                else if(str[j]=='B') str2[j]=(b==1)?'(':')';                else str2[j]=(c==1)?'(':')';            }            return check(str2);        }         boolean x=solve(i+1,mask,str,str2);        boolean y=solve(i+1,mask+(1<<i),str,str2);         return x||y;    }    public static void main(String[] args) throws Exception    {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         int i,N;         int T=Integer.parseInt(br.readLine().trim());        StringBuilder sb=new StringBuilder();         while (T-->0)        {            char[] str=br.readLine().trim().toCharArray();            char[] str2=new char[str.length];             sb.append(solve(0,0,str,str2)?"YES\n":"NO\n");        }        System.out.println(sb);    }}