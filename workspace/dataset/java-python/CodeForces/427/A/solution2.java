import java.util.Scanner;public class Test{ 	public static void main(String[] args) {		Scanner in = new Scanner(System.in);				int n = in.nextInt();		int[] arr = new int[n];		int count=0;		int hired=0,crime=0;				for(int i=0; i<n; i++)			arr[i] = in.nextInt();				for(int i=0; i<n; i++) {			if(arr[i]<0)				++crime;						if(arr[i]>0)				hired+=arr[i];						if(arr[i]<0 && hired>0) {				--hired;				--crime;			}		}		System.out.println(Math.abs(crime));	}}
