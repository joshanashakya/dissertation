import java.util.Scanner; public class Test {	public static void main(String[] args) { 		Scanner input = new Scanner(System.in); 		short j = input.nextShort(); 		while (((j / 1000) + (j % 1000 / 100) + (j % 100 / 10) + (j % 10)) % 4 != 0) {			j++;		} 		System.out.println(j);	}}