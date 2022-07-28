import java.util.Scanner; public class Codeforces { 	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n, amazingPerform = 0, i, j;		n = sc.nextInt();		int[] contests = new int[n];		for (i = 0; i < n; i++) {			contests[i] = sc.nextInt();		} 		for (i = 1; i < n; i++) {			boolean lessAmazing = true;			boolean moreAmazing = true;			for (j = i - 1; j >= 0; j--) {				lessAmazing = lessAmazing && contests[i] < contests[j];				moreAmazing = moreAmazing && contests[i] > contests[j];			}			if (lessAmazing || moreAmazing)				amazingPerform++;		}		System.out.println(amazingPerform);	} }