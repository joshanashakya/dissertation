import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Scanner;import java.lang.Math; public class BooBs {			public static void main (String[] args) {				Scanner sc= new Scanner(System.in) ;		String str1= sc.nextLine() ;		String str2= sc.nextLine() ;		char[] arr1= str1.toCharArray() ;		char[] arr2= str2.toCharArray() ;		int[] map1= new int[26] ;		Arrays.fill(map1, 0);		int[] map2= new int[26] ;		Arrays.fill(map2, 0);		int count= 0 ;		for(int i=0 ;i<str1.length() ;i++ ) {			map1[arr1[i] - 'a']++ ;		}for(int i=0 ;i<str2.length() ;i++ ) {			map2[arr2[i] - 'a']++ ; 		}for(int i=0 ;i<26 ;i++ ) {			if(map2[i] > 0) {				if(map1[i] == 0) {					count= -1 ;					break ;				}else if(map1[i] >= map2[i]) {					count += map2[i] ;				}else {					count += map1[i] ;				}			}		}if(count == 0) {			count= -1 ;		}		System.out.println(count);	}	}