import java.util.*; public class solucion2 { 	public static void main(String[] args) {		Scanner scan = new Scanner(System.in);		int d = scan.nextInt();		int hs = scan.nextInt();				int hmin = 0;		int hmax = 0;				int[] hminarray = new int[d];		int[] hmaxarray = new int[d];				for(int i = 0; i<d; i++) {			hminarray[i] = scan.nextInt();			hmin += hminarray[i];						hmaxarray[i] = scan.nextInt();			hmax += hmaxarray[i];		}				if(hs >= hmin && hs<= hmax) { 			System.out.println("YES");						int reparto = hs - hmin; 			for (int i = 0; i<d; i++) {				if (reparto>hmaxarray[i]-hminarray[i]) { 					reparto-=(hmaxarray[i]-hminarray[i]);					hminarray[i]=hmaxarray[i];				} else {					hminarray[i]+=reparto;					reparto=0;				}			}			for (int i=0; i<d; i++) {				System.out.print(hminarray[i]+" ");			}		} else System.out.println("NO");	}} 