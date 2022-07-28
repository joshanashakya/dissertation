import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.IOException;import java.io.PrintWriter;import java.util.Arrays;import java.util.List;import java.util.Scanner;import java.util.stream.Collectors;public class _p001183A {    static public void main(final String[] args) throws IOException {        p001183A._main(args);    }//begin p001183A.javastatic private class p001183A extends Solver{public p001183A(){nameIn="p001183A.in";singleTest=true;}int a;@Override protected void solve(){while(true){int sum=Arrays.stream(Integer.toString(a).split("")).mapToInt(v->v.charAt(0)-'0').sum();if(sum% 4==0){break;}int rest=4-sum % 4;if(a % 10 +rest<10){a+=rest;break;}else{a+=10-a % 10;}}pw.println(a);}@Override public void readInput()throws IOException{a=sc.nextInt();sc.nextLine();}static public void _main(String[]args)throws IOException{new p001183A().run();}}//end p001183A.java//begin net/leksi/contest/Solver.javastatic private abstract class Solver{protected String nameIn=null;protected StringnameOut=null;protected boolean singleTest=false;protected boolean preprocessDebug=false;protected boolean doNotPreprocess=false;protected Scanner sc=null;protectedPrintWriter pw=null;private void process()throws IOException{if(!singleTest){intt=lineToIntArray()[0];while(t-->0){readInput();solve();}}else{readInput();solve();}}abstract protected void readInput()throws IOException;abstract protected voidsolve()throws IOException;protected int[]lineToIntArray()throws IOException{returnArrays.stream(sc.nextLine().trim().split("\\s+")).mapToInt(Integer::valueOf).toArray();}protected long[]lineToLongArray()throws IOException{return Arrays.stream(sc.nextLine().trim().split("\\s+")).mapToLong(Long::valueOf).toArray();}protected String intArrayToString(final int[]a){return Arrays.stream(a).mapToObj(Integer::toString).collect(Collectors.joining(" "));}protected String longArrayToString(final long[]a){return Arrays.stream(a).mapToObj(Long::toString).collect(Collectors.joining(" "));}protected List<Long>longArrayToList(final long[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected List<Integer>intArrayToList(final int[]a){returnArrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.toList());}protectedList<Long>intArrayToLongList(final int[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected void run()throws IOException{try{try(FileInputStream fis=new FileInputStream(nameIn);PrintWriter pw0=select_output();){sc=new Scanner(fis);pw=pw0;process();}}catch(IOException ex){try(PrintWriterpw0=select_output();){sc=new Scanner(System.in);pw=pw0;process();}}}private PrintWriterselect_output()throws FileNotFoundException{if(nameOut !=null){return new PrintWriter(nameOut);}return new PrintWriter(System.out);}}//end net/leksi/contest/Solver.java}
