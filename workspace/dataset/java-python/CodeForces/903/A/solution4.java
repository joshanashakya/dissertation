import java.util.Scanner; public class Main{ 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner rm=new Scanner (System.in);		int a=rm.nextInt();		String c="";		int f=0;		for(int i=1;i<=a;i++) {			c="NO";			f=0;			int m=rm.nextInt();			for(int j=0;j<=33;j++) {				for(int h=0;h<=100/7;h++) {					if((j*3+h*7)==m) {						f=1;c="YES";						break;					}				}				if(f==1) {					break;				}			}			System.out.println(c);		}	}} 
