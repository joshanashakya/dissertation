import java.util.*;import java.io.*;public class Asd {     static Scanner s=new Scanner(System.in);    static PrintWriter w=new PrintWriter(System.out); public static void main(String args[])  {        int t=1;//s.nextInt();    while(t-->0)    {            solve();       }    w.close();   } public static void solve() {    int x1=s.nextInt();int y1=s.nextInt();    int x2=s.nextInt();int y2=s.nextInt();    int x3=s.nextInt();int y3=s.nextInt();        w.println(3);        double mid1=(double)(x1+x2)/2.0;double mid2=(double)(y1+y2)/2.0;        int x4=(int)(2*mid1)-x3;int y4=(int)(2*mid2)-y3;        w.println(x4+" "+y4);         mid1=(double)(x1+x3)/2.0; mid2=(double)(y1+y3)/2.0;         x4=(int)(2*mid1)-x2; y4=(int)(2*mid2)-y2;        w.println(x4+" "+y4);        mid1=(double)(x2+x3)/2.0; mid2=(double)(y2+y3)/2.0;         x4=(int)(2*mid1)-x1; y4=(int)(2*mid2)-y1;        w.println(x4+" "+y4); }    }
