import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Scanner;import java.lang.Math; public class Account {			public static void main (String[] args) {		Scanner sc= new Scanner(System.in) ;		int n= sc.nextInt() ;		int num= 0 ,k=0 ,l=0 ;		long sum= 0 ;		int[] x= new int[n] ;		int[] y= new int[n] ;		for(int i=0 ;i<n ;i++ ) {			num= sc.nextInt() ;			if(num > 0) {				x[k]= num ;				k++ ;			}else if(num < 0) {				y[l]= num*(-1) ;				l++ ;			}			sum += num ;		}if(sum > 0) 			System.out.println("first");		else if(sum < 0)			System.out.println("second");		else {			boolean flag= true ;			for(int i=0 ;i<Math.min(x.length, y.length) ;i++ ) {				if(x[i] > y[i]) {					System.out.println("first");					flag= false ;					break ;				}else if(x[i] < y[i]) {					System.out.println("second");					flag= false ;					break ;				}			}if(flag == true ) {				if(x.length > y.length) {					System.out.println("first");				}else if(x.length < y.length) {					System.out.println("second");				}else {					if(num > 0) {						System.out.println("first");					}else if(num < 0)						System.out.println("second");				}			}		}			}		}