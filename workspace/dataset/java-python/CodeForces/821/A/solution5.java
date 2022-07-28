import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.IOException;import java.io.PrintWriter;import java.util.Arrays;import java.util.Collection;import java.util.List;import java.util.Scanner;import java.util.function.Function;import java.util.stream.Collectors;import java.util.stream.IntStream;public class _p000821A {    static public void main(final String[] args) throws IOException {        p000821A._main(args);    }//begin p000821A.javastatic private class p000821A extends Solver{public p000821A(){nameIn="p000821A.in";singleTest=true;}int n;int[][]a;@Override protected void solve(){boolean res=true;l:for(int r=0;r<n;r++){for(int c=0;c<n;c++){if(a[r][c]>1){boolean found=false;l1:for(int r1=0;r1<n;r1++){if(a[r1][c]<a[r][c]){for(int c1=0;c1<n;c1++){if(a[r][c1]<a[r][c]&&a[r1][c]+a[r][c1]==a[r][c]){found=true;break l1;}}}}if(!found){res=false;break l;}}}}pw.println(res?"Yes":"No");}@Override public void readInput()throwsIOException{n=sc.nextInt();if(sc.hasNextLine()){sc.nextLine();}a=new int[n][];for(int _ia=0;_ia<n;_ia++){a[_ia]=Arrays.stream(sc.nextLine().trim().split("\\s+")).mapToInt(Integer::valueOf).toArray();}}static public void _main(String[]args)throwsIOException{new p000821A().run();}}//end p000821A.java//begin net/leksi/contest/Solver.javastatic private abstract class Solver{protected String nameIn=null;protected StringnameOut=null;protected boolean singleTest=false;protected boolean preprocessDebug=false;protected boolean doNotPreprocess=false;protected Scanner sc=null;protectedPrintWriter pw=null;private void process()throws IOException{if(!singleTest){intt=lineToIntArray()[0];while(t-->0){readInput();solve();}}else{readInput();solve();}}abstract protected void readInput()throws IOException;abstract protected voidsolve()throws IOException;protected int[]lineToIntArray()throws IOException{returnArrays.stream(sc.nextLine().trim().split("\\s+")).mapToInt(Integer::valueOf).toArray();}protected long[]lineToLongArray()throws IOException{return Arrays.stream(sc.nextLine().trim().split("\\s+")).mapToLong(Long::valueOf).toArray();}protected String joinToString(final int[]a){return Arrays.stream(a).mapToObj(Integer::toString).collect(Collectors.joining(" "));}protected String joinToString(final long[]a){return Arrays.stream(a).mapToObj(Long::toString).collect(Collectors.joining(" "));}@Deprecated protectedString intArrayToString(final int[]a){return joinToString(a);}@Deprecated protectedString longArrayToString(final long[]a){return joinToString(a);}protected<T>StringjoinToString(final T[]a){return Arrays.stream(a).map(v->v.toString()).collect(Collectors.joining(" "));}protected<T>String joinToString(final T[]a,final Function<T,String>toString){return Arrays.stream(a).map(v->v.toString()).collect(Collectors.joining(" "));}protected<T>String joinToString(final Collection<T>a){return a.stream().map(v->v.toString()).collect(Collectors.joining(" "));}protected<T>String joinToString(final Collection<T>a,final Function<T,String>toString){return a.stream().map(v->toString.apply(v)).collect(Collectors.joining(" "));}@Deprecated protected List<Long>longArrayToList(final long[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}@Deprecated protected List<Integer>intArrayToList(final int[]a){return Arrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.toList());}protected List<Long>intArrayToLongList(final int[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected List<Integer>toList(final int[]a){return Arrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.toList());}protected List<Long>toList(final long[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected void run()throws IOException{boolean done=false;if(nameIn !=null){try{try(FileInputStream fis=new FileInputStream(nameIn);PrintWriter pw0=select_output();){done=true;sc=new Scanner(fis);pw=pw0;process();}}catch(IOException ex){}}if(!done){try(PrintWriter pw0=select_output();){sc=new Scanner(System.in);pw=pw0;process();}}}private PrintWriter select_output()throws FileNotFoundException{if(nameOut !=null){return new PrintWriter(nameOut);}return new PrintWriter(System.out);}}//end net/leksi/contest/Solver.java}
