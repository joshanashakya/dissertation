import java.util.*;public class Solution{    public static void main(String[] args){        Scanner s=new Scanner(System.in);        long a=s.nextLong();        long b=s.nextLong();        long ans=1L;        if(b-a>=10){            System.out.println("0");        }        else{            for(long i=a+1;i<=b;i++){                ans=ans*(i%10);            }            ans=ans%10;            System.out.println(ans);        }            }}
