import java.util.*;import java.util.Arrays;public class Main{    public static void main (String[] args)      {          Scanner sc=new Scanner(System.in);        int w=sc.nextInt();        int h=sc.nextInt();        int u1=sc.nextInt();        int d1=sc.nextInt();        int u2=sc.nextInt();        int d2=sc.nextInt();        int total=w;        for(int i=h;i>0;i--)        {            total=total+i;            if(i==d1)            {                total=total-u1;            }            if(i==d2)            {                total=total-u2;            }            if(total<0)            {                total=0;            }                    }        System.out.println(total);    }  }         
