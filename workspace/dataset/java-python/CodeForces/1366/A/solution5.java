import java.util.*;public class Main{    public static void main(String[] args){        Scanner sc=new Scanner(System.in);        int t=sc.nextInt();        while(t-->0){            int a=sc.nextInt();            int b=sc.nextInt();            int sum=(a+b)/3;            int nas=Math.min(a,Math.min(b,sum));            System.out.println(nas);        }    }}