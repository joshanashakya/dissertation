import java.util.*;public class j2{    public static void main(String args[]){        Scanner sc=new Scanner(System.in);        String str=sc.next();        char ch[]=str.toCharArray();        Arrays.sort(ch);        int n=ch.length;        long ans=n;        long tmp=0;        for(int i=1;i<n;i++){            if(ch[i]==ch[i-1])                tmp++;            else{                long k=(tmp*(tmp+1)/2);                ans+=(2*k);                tmp=0;            }         }        long k=(tmp*(tmp+1)/2);        ans+=(2*k);        System.out.println(ans);     } }