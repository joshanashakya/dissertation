import java.util.*; public class CodeForces719B{	public static void main(String[] args) {		Scanner input = new Scanner(System.in);		int n = input.nextInt();		char[] arr = input.next().toCharArray();		int evenB = (n+1)/2, evenR = (n+1)/2;		int oddB = n/2, oddR = n/2;		for (int i = 0; i < arr.length; i++)		{			if (i % 2 == 0)			{				if (arr[i] == 'r')					evenR--;				else					evenB--;			}			else			{				if (arr[i] == 'r')					oddR--;				else					oddB--;			}		}		System.out.println(Math.min(Math.max(evenB, oddR), Math.max(evenR, oddB)));	}}