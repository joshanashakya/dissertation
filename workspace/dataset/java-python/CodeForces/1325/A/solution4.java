import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class EhabAndGcd {		public static void main(String[] args) throws IOException {		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));		int t=Integer.parseInt(reader.readLine());		while(t-->0) {			int x=Integer.parseInt(reader.readLine());			System.out.println(1+" "+(x-1));		}			reader.close();	}}