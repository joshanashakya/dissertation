import java.util.*;public class Main{    public static void main(String args[])    {        Scanner sc=new Scanner(System.in);        int t=sc.nextInt();        while(t-->0)        {            int n=sc.nextInt();            int k=sc.nextInt();                        for(int i=0;i<n;i++)            {                if(i%3==0)                System.out.print('a');                else if(i%3==1)                System.out.print('b');                else                System.out.print('c');                            }             System.out.println();                    }          }}