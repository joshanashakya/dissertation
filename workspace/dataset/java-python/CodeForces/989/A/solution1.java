import java.util.*;import java.util.Arrays;public class Main{    public static void main (String[] args)      {          Scanner sc=new Scanner(System.in);        String s=sc.next();        char[] a=new char[s.length()];        for(int i=0;i<s.length();i++)        {            a[i]=s.charAt(i);        }        int flag=0;        for(int i=1;i<s.length()-1;i++)        {            if(a[i] =='A' && ((a[i-1]=='B' && a[i+1]=='C') || (a[i-1]=='C' && a[i+1]=='B')))            {                flag=1;            }            else if(a[i]=='B' && ((a[i-1]=='A' && a[i+1]=='C') || (a[i-1]=='C' && a[i+1]=='A')))            {                flag=1;            }            else if(a[i]=='C' && ((a[i-1]=='B' && a[i+1]=='A') || (a[i-1]=='A' && a[i+1]=='B')))            {                flag=1;            }            if(flag==1)            {                break;            }        }        if(flag==1)        {            System.out.println("Yes");        }        else        {            System.out.println("No");        }    }  }         