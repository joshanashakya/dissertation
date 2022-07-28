import java.io.File;import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.IOException;import java.io.PrintWriter;import java.security.AccessControlException;import java.util.Arrays;import java.util.Collection;import java.util.List;import java.util.Scanner;import java.util.function.Function;import java.util.stream.Collectors;public class _p001354A {    static public void main(final String[] args) throws IOException {        p001354A._main(args);    }//begin p001354A.javastatic private class p001354A extends Solver{public p001354A(){nameIn="in/900/p001354A.in";}int a;int b;int c;int d;@Override protected void solve(){long res=-1;if(b>=a){res=b;}else if(c>d){long r=a-b;long n=(long)Math.ceil(1.0*r/(c-d));res=b+n*c;}pw.println(res);}@Override public void readInput()throws IOException{a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();d=sc.nextInt();if(sc.hasNextLine()){sc.nextLine();}}static public void _main(String[]args)throws IOException{new p001354A().run();}}//end p001354A.java//begin net/leksi/contest/Solver.javastatic private abstract class Solver{protected String nameIn=null;protected StringnameOut=null;protected boolean singleTest=false;protected boolean preprocessDebug=false;protected boolean doNotPreprocess=false;protected Scanner sc=null;protectedPrintWriter pw=null;private void process()throws IOException{if(!singleTest){intt=lineToIntArray()[0];while(t-->0){readInput();solve();}}else{readInput();solve();}}abstract protected void readInput()throws IOException;abstract protected voidsolve()throws IOException;protected int[]lineToIntArray()throws IOException{returnArrays.stream(sc.nextLine().trim().split("\\s+")).mapToInt(Integer::valueOf).toArray();}protected long[]lineToLongArray()throws IOException{return Arrays.stream(sc.nextLine().trim().split("\\s+")).mapToLong(Long::valueOf).toArray();}protected String joinToString(final int[]a){return Arrays.stream(a).mapToObj(Integer::toString).collect(Collectors.joining(" "));}protected String joinToString(final long[]a){return Arrays.stream(a).mapToObj(Long::toString).collect(Collectors.joining(" "));}protected<T>StringjoinToString(final T[]a){return Arrays.stream(a).map(v->v.toString()).collect(Collectors.joining(" "));}protected<T>String joinToString(final T[]a,final Function<T,String>toString){return Arrays.stream(a).map(v->v.toString()).collect(Collectors.joining(" "));}protected<T>String joinToString(final Collection<T>a){return a.stream().map(v->v.toString()).collect(Collectors.joining(" "));}protected<T>String joinToString(final Collection<T>a,final Function<T,String>toString){return a.stream().map(v->toString.apply(v)).collect(Collectors.joining(" "));}protected List<Long>intArrayToLongList(final int[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected List<Integer>toList(final int[]a){return Arrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.toList());}protected List<Long>toList(finallong[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected void run()throws IOException{boolean done=false;try{if(nameIn !=null&&new File(nameIn).exists()){try(FileInputStream fis=new FileInputStream(nameIn);PrintWriter pw0=select_output();){done=true;sc=new Scanner(fis);pw=pw0;process();}}}catch(IOException ex){}catch(AccessControlException ex){}if(!done){try(PrintWriterpw0=select_output();){sc=new Scanner(System.in);pw=pw0;process();}}}private PrintWriterselect_output()throws FileNotFoundException{if(nameOut !=null){return new PrintWriter(nameOut);}return new PrintWriter(System.out);}}//end net/leksi/contest/Solver.java}
