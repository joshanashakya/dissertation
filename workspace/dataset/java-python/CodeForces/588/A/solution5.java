import java.util.*;public class Main{    public static void main(String[] args)    {        Scanner x = new Scanner(System.in);        int days=x.nextInt();        int[][] l =new int[days][2];        for(int i =0;i<days;i++)        {            l[i][0]=x.nextInt();            l[i][1]=x.nextInt();        }        int ans=0;        int mini=l[0][1];        for(int i=0;i<days;i++)        {            mini=Math.min(mini,l[i][1]);            ans+=mini*l[i][0];        }        System.out.println(ans);        x.close();    }}
