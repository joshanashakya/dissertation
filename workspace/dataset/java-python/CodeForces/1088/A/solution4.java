import java.util.*;public class Main{    public static void main(String args[]){        Scanner sc=new Scanner(System.in);        int n=sc.nextInt();        int a=n,b=1,c=0;        while(a>=b)        {            if(a%b==0){                if(a*b>n){                    if(a/b<n){                        c++;                         break;                    }                }                else{                    b++;                }              }            else{                a--;            }                    }        if(c>0)        {            System.out.println(a+" "+b);                    }        else{            System.out.println("-1");        }    }}
