import java.util.*; public class GlebPizza { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);int R = sc.nextInt();int D = sc.nextInt();int n = sc.nextInt();int tot=0;int d=R-D;while(n-->0) {	int x=sc.nextInt();	x=Math.abs(x);	int y=sc.nextInt();	y=Math.abs(y);	int r = sc.nextInt();	if(2*r<=R-d) {		double f=max(x,y);		if((f<=R&&f>=d)) {			if((R-f>=r&&f-d>=r)) {				tot++;			}				}	}	} System.out.println(tot); 	}	static double max(int a ,int b) {		return  Math.sqrt(a*a+b*b);	} }
