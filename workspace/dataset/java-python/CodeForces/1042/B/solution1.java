import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner sc=new Scanner(System.in);        long n=sc.nextLong();        long a=1000000000,b=1000000000,c=1000000000,d=1000000000,e=1000000000,f=1000000000,g=1000000000;         for(long i=0;i<n;i++)        {            long c1=sc.nextLong();            String x=sc.next();            if(x.compareTo("A")==0){                a=Math.min(a,c1);            }            if(x.compareTo("B")==0){                b=Math.min(b,c1);            }            if(x.compareTo("C")==0){                c=Math.min(c,c1);            }            if(x.compareTo("AB")==0||x.compareTo("BA")==0){                d=Math.min(d,c1);            }            if(x.compareTo("BC")==0||x.compareTo("CB")==0) {                e=Math.min(e,c1);             }            if(x.compareTo("CA")==0||x.compareTo("AC")==0){                f=Math.min(f,c1);            }            if(x.length()==3){                g=Math.min(g,c1);            }        }         long min=1000000000;         min=Math.min(min,a+b+c);        min=Math.min(min,a+e);        min=Math.min(min,a+g);        min=Math.min(min,b+c+d);        min=Math.min(min,b+f);        min=Math.min(min,b+g);        min=Math.min(min,c+d);        min=Math.min(min,c+g);        min=Math.min(min,d+e);        min=Math.min(min,d+f);        min=Math.min(min,d+g);        min=Math.min(min,e+f);        min=Math.min(min,e+g);        min=Math.min(min,f+g);        min=Math.min(min,g);         if(min>=1000000000){            System.out.println("-1");        }        else{            System.out.println(min);        }     }}