import java.io.*;import java.util.*;public class Ishu{    static Scanner scan = new Scanner(System.in);    static void tc()    {    long x = scan.nextLong();    long[] a = new long[100001];    int i;    for(i=1;i<=100000;++i)        a[i] = (((long)(i)) * (i + 1)) / 2;             if(x < 0)        x *= (-1);                    int ans = 0;    for(i=0;i<100001;++i)            {        if(a[i] >= x)            {            ans = i;            break;            }        }          //  System.out.println((a[ans] - x));  //  System.out.println(ans);    if((a[ans] - x) % 2 == 1)        {        if(ans % 2 == 1)            ans += 2;        else            ++ans;        }  //if(x == 2)  //      ans--;    System.out.println(ans);    }    public static void main(String[] args)    {    int t = 1;    //t = scan.nextInt();    while(t-- > 0)        tc();    }}
