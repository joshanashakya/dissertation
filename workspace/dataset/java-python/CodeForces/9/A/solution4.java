import java.util.Scanner; public class Test {	public static void main(String[] args) {		Scanner in = new Scanner(System.in);				int y = in.nextInt();		int w = in.nextInt();				int favOutcomes= 7 - Math.max(y, w);				if(favOutcomes==1)			System.out.println("1/6");		else if(favOutcomes==2)			System.out.println("1/3");		else if(favOutcomes==3)			System.out.println("1/2");		else if(favOutcomes==4)			System.out.println("2/3");		else if(favOutcomes==5)			System.out.println("5/6");		else if(favOutcomes==6)			System.out.println("1/1");			}}
