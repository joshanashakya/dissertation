import java.util.Scanner;public class Main {     public static void main(String[] args) {	    Scanner s = new Scanner(System.in);	    int l = s.nextInt();	    int b = s.nextInt();	    int l1 = s.nextInt();	    int b1 = s.nextInt();	    int l2 = s.nextInt();	    int b2 = s.nextInt();	    int aa = (l1+l2);	    int bb = Math.max(b1,b2);	    int cc = (b1+b2);	    int dd = Math.max(l1,l2);	    int ee = (b1+l2);	    int ff = Math.max(l1,b2);	    int gg = (l1+b2);	    int hh = 	Math.max(l2,b1);	    Pair p1 = new Pair(aa,bb);	    Pair p2 = new Pair(bb,aa);	    Pair p3 = new Pair(cc,dd);	    Pair p4 = new Pair(dd,cc);	    Pair p5 = new Pair(ee,ff);	    Pair p6 = new Pair(ff,ee);	    Pair p7 = new Pair(gg,hh);	    Pair p8 = new Pair(hh,gg);	    Pair p = new Pair(l,b);	    Pair pp = new Pair(b,l);	    if(p1.x<=p.x && p1.y<=p.y || p1.x<=pp.x && p1.y<=pp.y){			System.out.println("YES");		}	    else if(p2.x<=p.x && p2.y<=p.y || p2.x<=pp.x && p2.y<=pp.y){			System.out.println("YES");		}	    else if(p3.x<=p.x && p3.y<=p.y || p3.x<=pp.x && p3.y<=pp.y){			System.out.println("YES");		}	    else if(p4.x<=p.x && p4.y<=p.y || p4.x<=pp.x && p4.y<=pp.y){			System.out.println("YES");		}	    else if(p5.x<=p.x && p5.y<=p.y || p5.x<=pp.x && p5.y<=pp.y){			System.out.println("YES");		}	    else if(p6.x<=p.x && p6.y<=p.y || p6.x<=pp.x && p6.y<=pp.y){			System.out.println("YES");		}		else if(p7.x<=p.x && p7.y<=p.y || p7.x<=pp.x && p7.y<=pp.y){			System.out.println("YES");		}		else if(p8.x<=p.x && p8.y<=p.y || p8.x<=pp.x && p8.y<=pp.y){			System.out.println("YES");		}	    else{			System.out.println("NO");		}      }}class Pair{    int x;    int y;    public Pair(int x,int y){        this.x = x;        this.y = y;    }}