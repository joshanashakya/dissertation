import java.util.*; public class Main{    public static void main(String[] args) {        int n,i;        Scanner sc=new Scanner(System.in);        n=sc.nextInt();        String s1="I love ";        String s2="I hate ";        int flag=0;        for(i=0;i<n;i++){            if(i%2==0){                System.out.print(s2);            }            else{                System.out.print(s1);            }            if(i!=n-1)                System.out.print("that ");        }        System.out.print("it");    }}  		  			 	  	  		 	 	 			  	  	