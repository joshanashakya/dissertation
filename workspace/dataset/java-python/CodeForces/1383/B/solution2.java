import java.util.*;import java.io.*; public class Main{    public static void main(String[] args) throws IOException{        In in = new In();        for(int qr = in.pint(); qr > 0; qr--) {        	int n = in.pint();        	int[] a = new int[n];        	in.tok();        	int[] bc = new int[32];        	for(int i = 0; i < n; i++) {        		a[i] = in.pint();        		for(int j = 0; j <= 30; j++) {        			bc[j] += (a[i] & (1 << j)) != 0 ? 1 : 0;        		}        	}        	int w = 0;        	for(int i = 30; i >= 0; i--) {        		if(bc[i] % 2 != 0) {        			if(bc[i] % 4 == 3 && (n - bc[i]) % 2 == 0) {        				w = -1;        			}else {        				w = 1;        			}        			break;        		}        	}        	System.out.println(w == 0 ? "DRAW" : (w == 1 ? "WIN" : "LOSE"));        }    }}   class In{    private BufferedReader in;    private StringTokenizer st = new StringTokenizer("");    public In(){        in = new BufferedReader(new InputStreamReader(System.in));    }        int pint() throws IOException{        if(st.hasMoreTokens()) {return Integer.parseInt(st.nextToken());}        else {return Integer.parseInt(in.readLine());}    }     double pdbl() throws IOException{        if(st.hasMoreTokens()) {return Double.parseDouble(st.nextToken());}        else {return Double.parseDouble(in.readLine());}    }    long plng() throws IOException{        if(st.hasMoreTokens()) {return Long.parseLong(st.nextToken());}        else {return Long.parseLong(in.readLine());}    }    char pchr() throws IOException{        if(st.hasMoreTokens()) {return st.nextToken().charAt(0);}        else {return in.readLine().charAt(0);}    }    String pstr() throws IOException{        if(st.hasMoreTokens()) {return st.nextToken();}        else {return in.readLine();}    }    String readLine() throws IOException{        return in.readLine();    }    boolean ready() throws IOException {return in.ready();}    boolean readyN() throws IOException{return in.ready() || st.hasMoreTokens();}    boolean tokens() {return st.hasMoreTokens();}    void tok() throws IOException{st = new StringTokenizer(in.readLine());}    void skip() throws IOException{in.readLine();}}