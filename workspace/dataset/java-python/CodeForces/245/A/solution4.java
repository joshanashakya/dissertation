import java.util.Scanner; public class SystemAdministrator {    public static void main(String[] args) {    Scanner sc=new Scanner(System.in);        int n=sc.nextInt();    int a0=0,at=0,b0=0,bt=0;    for(int i=0;i<n;i++)    {    int t=sc.nextInt();    int x=sc.nextInt();    int y=sc.nextInt();        if(t==1)        {        a0=a0+x;        at=at+y+x;        }        else        {        b0=b0+x;        bt=bt+y+x;        }    }    if(a0>=at/2)            System.out.println("LIVE");    else            System.out.println("DEAD");        if(b0>=bt/2)            System.out.println("LIVE");    else            System.out.println("DEAD");    }}
