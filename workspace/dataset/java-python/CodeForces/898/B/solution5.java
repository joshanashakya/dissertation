import java.util.*; import java.io.*; public class pn { 	public static void main(String[] args) throws IOException {		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		PrintWriter out = new PrintWriter(System.out);		int n = Integer.parseInt(in.readLine());		int a = Integer.parseInt(in.readLine());		int b = Integer.parseInt(in.readLine());		int num = 0;		int f = 0;		int ans = 0;		int i =0;		boolean notfound = false;		boolean less=false;		while(!notfound) {			if(i<0) {				less=true;				break;			}			num = n-i*a;			if(num<0) {				notfound=true;			}			if(num%b==0) {				f=2;				ans=i;				notfound=true;			}			i++;						}		if(less||(num/b)<0) {			System.out.println("NO");		}		else if(f==2) {			System.out.println("YES");			System.out.println(ans +" "+num/b);		}				else {			System.out.println("NO");		}		in.close();		out.close();	} }
