import java.util.*;public class stringgeneration{    public static void main(String[] args)    {	int t,n,k,i; 	Scanner sc=new Scanner(System.in); 	t=sc.nextInt(); 	while(t-->0)	{	   n=sc.nextInt();	   k=sc.nextInt(); 	   for(i=0;i<n;i++)	   {	      System.out.print((char)('a'+(i%3)));	   } 	   System.out.println(); 	}    }}