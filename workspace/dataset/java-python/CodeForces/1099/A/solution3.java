import java.util.Scanner;  public class Snowball { 	public static void main(String[] args) {		Scanner scan =new Scanner(System.in);		int w=scan.nextInt();		int h=scan.nextInt();				int u1=scan.nextInt();		int d1=scan.nextInt();				int u2=scan.nextInt();		int d2=scan.nextInt();				if(d2>d1){			d1+=d2;			d2=d1-d2;			d1-=d2;			u1+=u2;			u2=u1-u2;			u1-=u2;			}		w+=((h*(h+1)/2))-((d1-1)*d1/2);		w-=u1;		if(w<0)w=0;		w+=((d1*(d1-1))/2)-((d2-1)*d2/2);		w-=u2;		if(w<0)w=0;		w+=(d2*(d2-1))/2;		System.out.println(w);	} }  