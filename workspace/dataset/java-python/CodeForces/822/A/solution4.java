import java.io.*; public class A { 	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 	public static void main(String[] args)throws IOException { 		int a,b;		String[] input = new String[2]; 		input = br.readLine().split(" ");		a=Integer.parseInt(input[0]);		b=Integer.parseInt(input[1]);		int min=Math.min(a,b);		int ans=1;		for(int i=1;i<=min;i++) {						ans=ans*i;			}		System.out.println(ans);	}}
