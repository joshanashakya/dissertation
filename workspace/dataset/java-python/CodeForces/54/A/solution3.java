import java.util.Scanner;public class Ishu{    public static void main(String[] args)    {        Scanner scan=new Scanner(System.in);        int N,K,C,i,in,fi,sum=0;        boolean flag=true,flag1=true;        int[] holi=new int[365];        N=scan.nextInt();        K=scan.nextInt();        C=scan.nextInt();        for(i=0;i<C;++i)            holi[i]=scan.nextInt();        in=fi=0;        while(N-->0)        {            flag=flag1=false;            ++fi;            if(fi-in==K)                 flag1=true;            for(i=0;i<C;++i)                if(fi==holi[i])                    {                     flag=true;                     break;                    }            if(flag||flag1)                {                 ++sum;                 in=fi;                }        }        System.out.println(sum);    }}