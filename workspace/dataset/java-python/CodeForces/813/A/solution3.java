import java.util.Scanner;public class codeforces813A{ 	public static void main(String[] args) 	{ 		Scanner s=new Scanner(System.in);		int x=0,n=s.nextInt(),i,m,ans=0;        boolean j=false;        for(i=0;i<n;i++)        x=x+s.nextInt();        m=s.nextInt();        int[] c = new int[m];        int[] b = new int[m];        for(i=0;i<m;i++)        {            c[i]=s.nextInt();            b[i]=s.nextInt();        }        for(i=0;i<m;i++)        {            if(x>=c[i]&&x<=b[i])            {                ans=x;                j=true;                break;            }            else if(x<c[i])            {                ans=c[i];                j=true;                break;            }        }        if(j==true)        System.out.print(ans);        else        System.out.print(-1);    }}