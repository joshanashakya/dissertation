import java.util.Scanner;  public class Main {     public static void main(String[] args){        // TODO Auto-generated method stub        Scanner in=new Scanner(System.in);        int n=in.nextInt();        int p=in.nextInt();        int k=in.nextInt();        int max=(p+k);        int min=(p-k);        if(min>1)            System.out.print("<< ");        for(int i=min;i<p;i++)        {            if(i>0)                System.out.print(i+" ");        }        System.out.printf("(%d) ",p);        for(int i=p+1;i<=max;i++)        {            if(i<=n)                System.out.print(i+" ");        }        if(max<n)            System.out.print(">>");                in.close();    } }