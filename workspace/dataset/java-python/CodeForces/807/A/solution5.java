import java.util.*;public class IsItRated{	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int in = sc.nextInt();		boolean diff = false;		Integer[] arr = new Integer[in];		Integer[] hold = new Integer[in];		for(int i = 0;i<in;i++)		{			int temp = sc.nextInt();			arr[i] = sc.nextInt();			if(arr[i]!=temp)				diff = true;			hold[i] = arr[i];		}		if(diff)			System.out.println("rated");		else		{			Arrays.sort(arr,Collections.reverseOrder());			boolean out = false;			for(int i = 0;i<in;i++)			{				if(arr[i]!=hold[i])				{					System.out.println("unrated");					out = true;					break;				}			}			if(!out)				System.out.println("maybe");		}	}}
