import java.util.Scanner; public class problem51 { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc = new Scanner(System.in);		int first = sc.nextInt();		int second = sc.nextInt();		if(second<first)		{			int temp = first;			first = second;			second = temp;		}				int tf=0;		int total=0;		int ts=0;		while(first<second)		{			first++;			tf++;			total = total+tf;			if(first<second)			{			second--;			ts++;			total = total+ts;		}}		System.out.println(total);	}  }
