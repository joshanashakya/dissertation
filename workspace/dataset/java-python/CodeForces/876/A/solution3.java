import java.util.*;public class Solution{    public static void main(String[] args){        Scanner s=new Scanner(System.in);        int n=s.nextInt();        int a=s.nextInt();        int b=s.nextInt();        int c=s.nextInt();        String[] d={"R","O","E"};        int[] d1={a,b,c};        int count=1,dist=0;        String curr=d[0];int e=a,f=b;        while(count!=n){            count++;            int min=Math.min(e,f);                    dist=dist+min;            if(min==e)            {                curr=d[1];                f=c;                e=a;            }            else{                curr=d[2];                e=c;                f=b;            }        }        System.out.println(dist);    }}
