import java.io.*;import java.util.*;public class Main{    public static void main(String args[]){        Scanner sc=new Scanner(System.in);	    int n=sc.nextInt();	    int ar[]=new int[n];	    for(int i=0;i<n;i++){	        ar[i]=sc.nextInt();	    }	    int f=0;	    for(int i=0;i<n;i++){	        if(ar[i]==1){	            System.out.println("HARD");	            f=1;	            break;	        }	    }	    if(f==0){	        System.out.println("EASY");	    }    }}
