import java.util.*;public class math{    public static void main(String args[])    {        Scanner in=new Scanner(System.in);        int t=in.nextInt();        int i,j;        while(t-->0)        {            int a=in.nextInt();            int b=in.nextInt();            int x=Math.max(a,b);            int y=Math.min(a,b);            if((2*x-y)%3==0 && y>=(2*x-y)/3)            System.out.println("Yes");            else            System.out.println("No");        }    }}    