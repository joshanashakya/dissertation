/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Balloons{    public static void main (String[] args) throws java.lang.Exception    {    try {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        char s[]=br.readLine().toCharArray();        boolean t=false;        for(int i=0;i<s.length-2;i++)        {            if(s[i]!=s[i+1] && s[i+1]!=s[i+2] && s[i]!=s[i+2]&& s[i]!='.' && s[i+1]!='.' && s[i+2]!='.')            {                //System.out.println(s[i]+" "+s[i+1]+" "+s[i+2]);                t=true;                break;            }                    }        if(t)            System.out.println("YES");            else                System.out.println("No");       } catch(Exception e) {    return;}    }}