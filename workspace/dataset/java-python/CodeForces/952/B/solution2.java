import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class A_Map_of_the_Cat_1800 {	public static void main(String[] args) throws IOException{		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		String Response;		int numnos = 0;				try {			for (int i = 0; i<=9; i++) {				System.out.println(i);				Response = br.readLine();				if (Response.equals("cool") || Response.equals("great!") || Response.equals("not bad") || Response.equals("don't think so") || Response.equals("don't touch me!")) {					System.out.println("normal");					break;				}				else if (Response.equals("terrible") || Response.equals("worse") || Response.equals("no way") || Response.equals("don't even") || Response.equals("are you serious?") || Response.equals("go die in a hole")) {					System.out.println("grumpy");					break;				}								if (Response.equals("no")) {					if (++numnos>3) {						System.out.println("normal");					}				}			}		}		catch (Exception e) {			e.printStackTrace();		}	}}