import java.io.*;import java.util.*;public class kuchBhi{	public static void main(String[] args) throws Throwable{		// BufferedReader br = new BufferedReader(new FileReader("input.txt"));		// String in = br.nextLine();		Scanner sc = new Scanner(new File("input.txt"));		BufferedWriter br1 = new BufferedWriter(new FileWriter("output.txt"));		String temp = sc.nextLine();		long a = sc.nextInt();		if(temp.equals("front"))		{			if(a==1)				br1.write("L");			else				br1.write("R");		}		else		{			if(a==2)				br1.write("L");			else				br1.write("R");		}		sc.close();		br1.close();	}}