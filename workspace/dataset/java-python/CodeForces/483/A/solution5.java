import java.util.*;public class CounterExample {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        long l = sc.nextLong();        long r = sc.nextLong();         long a=0;        long b=0;        long c=0;        sc.close();         for(long i = l;i<=r;i++)        {            if(i%2==0 && a==0)            {                a = i;            }             else if(i%2!=0 && a!=0)            {                b = i;            }            else if(i%2==0 &&(a!=0 && b!=0))            {                c = i;                break;            }        }        if(a!=0 && b!=0 && c!=0)        System.out.println(a+" "+b+" "+c);        else        System.out.println(-1);    }    }