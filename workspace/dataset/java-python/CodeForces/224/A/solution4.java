                             import java.util.*;  		public class dummycodes{ 						public static int solve(int arr[] ,int n) {		int i=0;		while(n>0) {			n-=arr[i];			if(n<=0) break;			i++;			i=i%7;											}		return i+1;			} 		  public static void main(String args[])  { Scanner sc=new Scanner(System.in);    int I1=sc.nextInt();int I2=sc.nextInt();int I3=sc.nextInt(); double l1=Math.sqrt((I1*I3)/I2);double l2=Math.sqrt((I2*I1)/I3);double l3=Math.sqrt((I2*I3)/I1); int ans=(int)(4*(l1+l2+l3));System.out.println(ans);        }}                                                                            
