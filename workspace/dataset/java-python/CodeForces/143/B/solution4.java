//package cp2;import java.util.*;public class asd{    static Scanner s=new Scanner(System.in);                  public static void main(String args[])         {                            long t=1;                  while(t-->0)                  {                      solve();                  }                                             }         public static void solve()         {            String str=s.next();            boolean minus=false;            if(str.charAt(0)=='-')                minus=true;            boolean dot=false;            String postdot="";int pos=-1;            for(int i=0;i<str.length();i++)            {                char ch=str.charAt(i);                if(ch=='.')                { dot=true;pos=i;break;}            }            if(dot)            {                if(pos+1==str.length()-1)                    str+="0";                else                    str=str.substring(0,pos+3);            }            else                str+=".00";            if(str.charAt(0)=='-')                minus=true;             for(int i=0;i<str.length();i++)            {                char ch=str.charAt(i);                if(ch=='.')                { dot=true;pos=i;break;}            }            // System.out.println(str);             String str4="";             if(minus)                 str4=sdf(str.substring(1, pos));             else                 str4=sdf(str.substring(0, pos));             str4=str4+str.substring(pos,str.length());                          str4="$"+str4;              if(minus)            {               str4="("+str4+")";            }            System.out.println(str4);         }         public static String sdf(String str)         {             String str2[]=new String[str.length()];             for(int i=0;i<str.length();i++)             {                 char ch=str.charAt(i);                 str2[i]=String.valueOf(ch);                                               }               int a=1;             String str3="";                          for(int i=str.length()-1;i>=1;i--)             {                 if(a%3==0)                     str2[i]=","+str2[i];                                  a++;             }             for(int i=0;i<str.length();i++)                 str3=str3+str2[i];             return str3;         }}