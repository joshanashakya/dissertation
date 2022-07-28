
import java.io.IOException;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Bit_year{
	static Set<String> set;
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		set = new TreeSet<String>();
		
		System.out.println((long)permute(n));
		
	}
	public static long permute(int n){
		
		int pow=2;
		while(pow<=10)
		{
			char[] ar = new char[pow];
			//System.out.println("lenght"+pow);
			for(int i=0;i<pow/2;i++)ar[i]='4';
			for(int i=pow/2;i<pow;i++)ar[i]='7';
			permuteHelper(ar, 0);
			//System.out.println(set.toString());
			for(String s : set)
			{
				if(Long.parseLong(s)>=n) {return Long.parseLong(s);}
			}
			
			pow+=2;
		}
		return 0;
	}
	private static void permuteHelper(char[] arr, int index){
	    if(index >= arr.length - 1){ //If we are at the last element - nothing left to permute
	    	set.add(new String(arr));
	        //System.out.println(Arrays.toString(arr));
	        return;
	    }

	    for(int i = index; i < arr.length; i++){ //For each index in the sub array arr[index...end]

	        //Swap the elements at indices index and i
	        char t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;

	        //Recurse on the sub array arr[index+1...end]
	        permuteHelper(arr, index+1);

	        //Swap the elements back
	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
	}
	
}

