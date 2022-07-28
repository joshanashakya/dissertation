import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.IOException;import java.io.PrintWriter;import java.util.Arrays;import java.util.Collection;import java.util.List;import java.util.Scanner;import java.util.function.Function;import java.util.stream.Collectors;public class _p000912A {    static public void main(final String[] args) throws IOException {        p000912A._main(args);    }//begin p000912A.javastatic private class p000912A extends Solver{public p000912A(){nameIn="p000912A.in";singleTest=true;}int A;int B;int x;int y;int z;@Override protected void solve(){long A1=2l*x+y;long B1=y+3l*z;long res=(A1>A?A1-A:0)+(B1>B?B1-B:0);pw.println(res);}@Override public void readInput()throws IOException{A=sc.nextInt();B=sc.nextInt();if(sc.hasNextLine()){sc.nextLine();}x=sc.nextInt();y=sc.nextInt();z=sc.nextInt();if(sc.hasNextLine()){sc.nextLine();}}static public void _main(String[]args)throwsIOException{new p000912A().run();}}//end p000912A.java//begin net/leksi/contest/Solver.javastatic private abstract class Solver{protected String nameIn=null;protected StringnameOut=null;protected boolean singleTest=false;protected boolean preprocessDebug=false;protected boolean doNotPreprocess=false;protected Scanner sc=null;protectedPrintWriter pw=null;private void process()throws IOException{if(!singleTest){intt=lineToIntArray()[0];while(t-->0){readInput();solve();}}else{readInput();solve();}}abstract protected void readInput()throws IOException;abstract protected voidsolve()throws IOException;protected int[]lineToIntArray()throws IOException{returnArrays.stream(sc.nextLine().trim().split("\\s+")).mapToInt(Integer::valueOf).toArray();}protected long[]lineToLongArray()throws IOException{return Arrays.stream(sc.nextLine().trim().split("\\s+")).mapToLong(Long::valueOf).toArray();}protected String joinToString(final int[]a){return Arrays.stream(a).mapToObj(Integer::toString).collect(Collectors.joining(" "));}protected String joinToString(final long[]a){return Arrays.stream(a).mapToObj(Long::toString).collect(Collectors.joining(" "));}@Deprecated protectedString intArrayToString(final int[]a){return joinToString(a);}@Deprecated protectedString longArrayToString(final long[]a){return joinToString(a);}protected<T>StringjoinToString(final T[]a){return Arrays.stream(a).map(v->v.toString()).collect(Collectors.joining(" "));}protected<T>String joinToString(final T[]a,final Function<T,String>toString){return Arrays.stream(a).map(v->v.toString()).collect(Collectors.joining(" "));}protected<T>String joinToString(final Collection<T>a){return a.stream().map(v->v.toString()).collect(Collectors.joining(" "));}protected<T>String joinToString(final Collection<T>a,final Function<T,String>toString){return a.stream().map(v->toString.apply(v)).collect(Collectors.joining(" "));}@Deprecated protected List<Long>longArrayToList(final long[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}@Deprecated protected List<Integer>intArrayToList(final int[]a){return Arrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.toList());}protected List<Long>intArrayToLongList(final int[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected List<Integer>toList(final int[]a){return Arrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.toList());}protected List<Long>toList(final long[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected void run()throws IOException{boolean done=false;if(nameIn !=null){try{try(FileInputStream fis=new FileInputStream(nameIn);PrintWriter pw0=select_output();){done=true;sc=new Scanner(fis);pw=pw0;process();}}catch(IOException ex){}}if(!done){try(PrintWriter pw0=select_output();){sc=new Scanner(System.in);pw=pw0;process();}}}private PrintWriter select_output()throws FileNotFoundException{if(nameOut !=null){return new PrintWriter(nameOut);}return new PrintWriter(System.out);}}//end net/leksi/contest/Solver.java}