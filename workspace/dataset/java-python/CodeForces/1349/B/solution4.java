import java.util.Arrays;import java.util.Scanner; public class D {	public static void main(String[] args) {		Scanner sc=new Scanner(System.in);		int t=sc.nextInt();		while(t-->0) {			int n=sc.nextInt();			int k=sc.nextInt();			int nums[]=new int[n];			int arr[]=new int[n];			boolean exist=false;			for(int i=0;i<nums.length;i++) {				nums[i]=sc.nextInt();				if(nums[i]==k) {					exist=true;				}				arr[i]=(nums[i]>=k)?1:0;			}			if(n==1) {				if(nums[0]!=k) {					System.out.println("no");				}else {					System.out.println("yes");				}				continue;			}			if(!exist) {				System.out.println("no");				continue;			}			boolean can=false;			for(int i=0;i<n;i++) {				for(int j=i+1;j<n && j-i<=2;j++) {					if(arr[i]>0 && arr[j]>0) {						can=true;						break;					}				}			}			if(can) {				System.out.println("yes");			}else {				System.out.println("no");			}				}	}}