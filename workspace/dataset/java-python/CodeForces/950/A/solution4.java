import java.util.*;public class Solution{    public static void main(String[] args){        Scanner s=new Scanner(System.in);        int l=s.nextInt();        int r=s.nextInt();        int a=s.nextInt();        int min=Math.min(l,r);        int max=Math.max(l,r);        int diff=max-min;        if(diff==0){            min=min+a/2;            max=max+a/2;        }        else{            if(a>=diff){                min=min+diff;                a=a-diff;                min=min+a/2;                max=max+a/2;            }            else{                min=min+a;            }        }        System.out.println(min*2);    }}   
