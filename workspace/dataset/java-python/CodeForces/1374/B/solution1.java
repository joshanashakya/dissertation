import java.util.*;public class Solution{    public static void main(String[] args)    {        Scanner sc = new Scanner(System.in);        int t = sc.nextInt();        int n,count2,count3;        boolean flag;        for(int i=0;i<t;i++)        {            n = sc.nextInt();            flag = true;            count2=0;            count3=0;            while(n!=1)            {                if(n%2==0)                {                    count2++;                    n = n/2;                }                else if(n%3==0)                {                    count3++;                    n = n/3;                }                else                {                    flag = false;                    System.out.println("-1");                    break;                }            }            if(flag)            {                if(count2<=count3)                {                    System.out.println(2*count3-count2);                }                else                {                    System.out.println("-1");                }            }        }    }}
