import java.util.*;public class Solution{    public static void main(String[] args){        Scanner s=new Scanner(System.in);        int n=s.nextInt();        int a[]=new int[n];        for(int i=0;i<n;i++)            a[i]=s.nextInt();        Arrays.sort(a);        boolean v=false;        for(int j=0;j<n-2;j++){            if((a[j]+a[j+1])>a[j+2]){                v=true;                break;            }        }        if(v==false)            System.out.println("NO");        else            System.out.println("YES");    }}
