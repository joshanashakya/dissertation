import java.util.*;public class nammekyahirakhahai{    public static void main(String args[])    {        Scanner in=new Scanner(System.in);        int t=in.nextInt();        int i,j;        while(t-->0)        {            int x1=in.nextInt();            int y1=in.nextInt();            int z1=in.nextInt();            int x2=in.nextInt();            int y2=in.nextInt();            int z2=in.nextInt();            int pos=0,neg=0;            pos=Math.min(z1,y2);            z1=z1-pos;            y2=y2-pos;           // System.out.println((z2-z1-x1)+" "+(y1-y2-x2));            z2=z2-z1-x1>0?z2-z1-x1:0;            y1=y1-y2-x2>0?y1-y2-x2:0;          //  System.out.println(z2+" "+y1);            neg=Math.min(z2,y1);            System.out.println((pos-neg)*2);        }    }}//https://codeforces.com/problemset/problem/1466/C    