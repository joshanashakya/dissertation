import java.io.*;import java.util.*;@SuppressWarnings("unused")public class Solution { //Название класса здесь	private static boolean IOTypeIsFile = false; //Вид ввода/вывода. true-через файл. false-через консоль.	private static String FileInput = ""; //Название файла ввода	private static String FileOutput = "";//Название файла вывода	private static Scanner in;	private static PrintStream out,err;	private static String ts(Object a) {return String.valueOf(a);}	private static int ti(String a) {return Integer.valueOf(a);}	private static double td(String a) {return Double.valueOf(a);}	private static int[] arrayI(int n) {int[] ans = new int[n];		for(int i = 0; i < n; ++i) {ans[i] = in.nextInt();}Arrays.sort(ans);return ans;	}	private static String[] arrayS(int n) {String[] ans = new String[n];		for(int i = 0; i < n; ++i) {ans[i] = in.next();}Arrays.sort(ans);return ans;	}	private static double[] arrayD(int n) {double[] ans = new double[n];		for(int i = 0; i < n; ++i) {ans[i] = in.nextDouble();}Arrays.sort(ans);return ans;	}	private static void SomeVeryLargeUndUselessFunctionName() {if (!IOTypeIsFile) {err.print(FileInput+FileOutput);}}	public static void main(String[] args) {		err=new PrintStream(System.err);		if(IOTypeIsFile) {			File f = new File(FileInput);			try {				in = new Scanner(f);				out = new PrintStream(FileOutput);			} catch (FileNotFoundException var3) {System.err.println("404");}		} else {			in = new Scanner(System.in);			out = new PrintStream(System.out);		}		run();		in.close();		out.close();	}	//Код пишут отсюда	private static void run() {		Vector<Integer>p=new Vector<>();		for (int i=0;i<10;i++){			out.println(ts(i)+ts(i)+ts(i)+ts(i));			out.flush();			int b=in.nextInt();in.nextInt();			if (b==4){return;}			else {for (;b>0;b--){p.add(i);}}		}		int u=0;		for (int i=0;i<10;i++){			if (!p.contains(i)){u=i;break;}		}		int[]d={u,u,u,u};		for (int i=0;i<4;i++){			for (int k=0;k<p.size();k++){				int j=p.get(k);				d[i]=j;				out.println(ts(d[0])+ts(d[1])+ts(d[2])+ts(d[3]));				out.flush();				int b=in.nextInt()-1;in.nextInt();				if (b==3){return;}				else if (b==i){p.removeElementAt(k);break;}			}		}	}}