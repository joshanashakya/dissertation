import java.util.Scanner;import java.util.Arrays;public class Solution{	public static void main(String args[]){		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int m = sc.nextInt();		int arr1[] = new int[n];		int arr2[] = new int[m];		for(int i1=0;i1<n;i1++){			arr1[i1]=sc.nextInt();		}		for(int i2=0;i2<m;i2++){			arr2[i2]=sc.nextInt();		}		Arrays.sort(arr1);		Arrays.sort(arr2);		if(arr1[n-1]<arr2[0]){			if(arr1[0]<=(arr1[n-1]/2)){				System.out.println(arr1[n-1]);			}else{				if((2*arr1[0]<arr2[0])){					System.out.println(2*arr1[0]);				}else {					System.out.println("-1");				}			}		}else{			System.out.println("-1");		}	}}