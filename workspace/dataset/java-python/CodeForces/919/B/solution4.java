import java.util.*;public class Solution{    public static void main(String[] args){        Scanner s=new Scanner(System.in);        int i=10,sum=0,count=0,ans=0;        int k=s.nextInt();        while(true){            sum=0;            int j=i;            while(j!=0){                int a=j%10;                sum=sum+a;                j=j/10;            }            if(sum==10){                count++;                if(count==k){                    ans=i;                    break;                }                    }            i++;        }        System.out.println(ans);                    }}    
