import java.util.*;public class problem{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        String[] c=new String[n];        for(int i=0;i<n;i++)        {            c[i]=sc.next();        }        int m=6-n;        System.out.println(m);        int p=0,r=0,g=0,b=0,o=0,y=0;        String s1="purple",s2="green",s3="blue",s4="red",s5="orange";        for(int i=0;i<n;i++)        {            if(c[i].equals(s1))                p++;            else if(c[i].equals(s2))                g++;            else if(c[i].equals(s3))                b++;            else if(c[i].equals(s4))                r++;            else if(c[i].equals(s5))                o++;            else                y++;        }        if(p==0)            System.out.println("Power");        if(g==0)            System.out.println("Time");        if(b==0)            System.out.println("Space");        if(r==0)            System.out.println("Reality");        if(o==0)            System.out.println("Soul");        if(y==0)            System.out.println("Mind");    }} 