import java.util.Scanner;

public class Klargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		int q=s.nextInt();
		int arr[]=new int[len];
		int ones=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			if(arr[i]==1) {
				++ones;
			}
		}
		while(q!=0) {
			int x=s.nextInt();
			int k=s.nextInt();
			if(x==1) {
				arr[k-1]=1-arr[k-1];
				if(arr[k-1]==1) {
					++ones;
				}else {
					--ones;
				}
			}else {
				if(k<=ones) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}
			q--;
		}

	}

}

