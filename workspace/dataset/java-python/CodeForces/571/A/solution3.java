import java.util.Scanner;  public class Main {	 public static Scanner in = new Scanner(System.in);	 public static int a , b , c , L;	 public static long cal(int l){		   int ti[] = new int[3];		   ti[0] = (l + a + b - c + 1)/2;		   ti[1] = (l + a + c - b + 1)/2;		   ti[2] = (l + c + b - a + 1)/2;		   for(int i=0 ; i<3 ; i++)			     if(ti[i] <= 0) return 0;		  // System.out.println(l + "   " + ti[0] + " " + ti[1] + " "+ ti[2]);		   long  ans = 0;		   for(int s = 0; s<8 ; s++){			     int cnt = l, ok = 0;			     for(int k =0 ; k< 3 ; k++) {			    	     if((s>>k&1) == 1){			    	    	 cnt -= ti[k];			    	    	 ok++;			    	     }			     }			     if((ok&1) == 1) ok=-1 ; else ok = 1;			     if(cnt < 0) continue;			     ans += (long)(cnt+3 - 1)*(cnt+3 - 2)/2 * ok;		   }		  // System.out.println(ans);		   return ans;	 }	 public static void main(String Args[]){		   a = in.nextInt(); b = in.nextInt();		   c = in.nextInt(); L = in.nextInt();		   long all = 0;		   for(int i=0;i<=L;i++){			    all += cal(i);		   }		   System.out.println(all);	 }}