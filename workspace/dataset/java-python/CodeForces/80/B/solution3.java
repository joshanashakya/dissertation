import java.util.Scanner; public class Apple { 	public static void main(String args[]) { 		try { 			Scanner sc = new Scanner(System.in); 			String str[] = new String[2];			str = sc.next().split(":"); 			double a = Integer.parseInt(str[0]);			double b = Integer.parseInt(str[1]); 			double min = b * 6; 			double hr = a * 30 + b / 2;						if(hr >= 360.0) {				hr = hr - 360;			} 			System.out.println(hr + " " + min); 		} catch ( 		Exception e) {			return; 		}	}}