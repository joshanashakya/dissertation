import java.util.*;public class Main{       public static void main(String args[])    {        	Scanner s=new Scanner(System.in);        //	int T=s.nextInt();           int n=s.nextInt();        	    int m=s.nextInt();        	    if(m==10){        if(n==1){            System.out.print(-1);        }        else{            for(int i=0;i<n-1;i++){               System.out.print(1);            }            System.out.print(0);        }    }    else{        for(int i=0;i<n;i++){            System.out.print(m);        }           }        	            }        }   