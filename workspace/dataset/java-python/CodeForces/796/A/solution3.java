import java.util.*;public class Solution{    public static void main(String[] args){        Scanner s=new Scanner(System.in);        int n=s.nextInt();        int m=s.nextInt();        int k=s.nextInt();        int a[]=new int[n];        for(int i=0;i<n;i++)            a[i]=s.nextInt();        m=m-1;        int min=Integer.MAX_VALUE,min1=Integer.MAX_VALUE;        for(int j=0;j<m;j++){            if(k>=a[j] && a[j]!=0){                if((m-j)<min)                    min=m-j;            }        }        for(int j1=m+1;j1<n;j1++){            if(k>=a[j1] && a[j1]!=0){                if((j1-m)<min1)                    min1=j1-m;            }        }        int p=Math.min(min,min1);        System.out.println(p*10);    }}
