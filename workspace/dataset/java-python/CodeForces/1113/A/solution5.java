import java.util.*;public class A{    public static void main(String[] args)    {        Scanner s=new Scanner(System.in);        int n=s.nextInt();        int v=s.nextInt();        int rd=n-1;        int cp=Math.min(v,n-1);        int ans=cp;        for(int i=2;i<n;i++)        {            if(cp>=rd)            {                break;            }            ans+=i;            cp++;        }        System.out.println(ans);       //  System.out.println(v+sum);    }}