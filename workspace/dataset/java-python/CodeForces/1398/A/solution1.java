import java.util.Scanner;

public class BadTriangle {
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int test_case = scan.nextInt();
		while(test_case-->0){
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}
			
			if(arr[n-1] >= (arr[0] + arr[1])){
				System.out.println(1+" "+2+" "+n);
			}else{
				System.out.println("-1");
			}
		}
		
		
		scan.close();
	}
}
