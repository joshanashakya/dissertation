import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.IOException;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Arrays;import java.util.List;import java.util.Scanner;import java.util.TreeSet;import java.util.stream.Collectors;public class _p001056A {    static public void main(final String[] args) throws IOException {        p001056A._main(args);    }//begin p001056A.javastatic private class p001056A extends Solver{public p001056A(){nameIn="p001056A.in";singleTest=true;}int n;Cy0[]f0;@Override protected void solve(){TreeSet<Integer>set=new TreeSet<>();ArrayList<Integer>list=new ArrayList<>();set.addAll(Arrays.stream(f0[0].t).mapToObj(Integer::valueOf).collect(Collectors.toList()));for(int i=1;i<n;i++){list.clear();for(int tt:f0[i].t){if(set.contains(tt)){list.add(tt);}}set.clear();set.addAll(list);}pw.println(set.stream().map(v->v.toString()).collect(Collectors.joining(" ")));}static class Cy0{int r;int[]t;}@Override public void readInput()throws IOException{n=sc.nextInt();if(sc.hasNextLine()){sc.nextLine();}f0=new Cy0[n];for(int _if0=0;_if0<n;_if0++){f0[_if0]=new Cy0();f0[_if0].r=sc.nextInt();f0[_if0].t=Arrays.stream(sc.nextLine().trim().split("\\s+")).mapToInt(Integer::valueOf).toArray();}}static public void _main(String[]args)throws IOException{new p001056A().run();}}//end p001056A.java//begin net/leksi/contest/Solver.javastatic private abstract class Solver{protected String nameIn=null;protected StringnameOut=null;protected boolean singleTest=false;protected boolean preprocessDebug=false;protected boolean doNotPreprocess=false;protected Scanner sc=null;protectedPrintWriter pw=null;private void process()throws IOException{if(!singleTest){intt=lineToIntArray()[0];while(t-->0){readInput();solve();}}else{readInput();solve();}}abstract protected void readInput()throws IOException;abstract protected voidsolve()throws IOException;protected int[]lineToIntArray()throws IOException{returnArrays.stream(sc.nextLine().trim().split("\\s+")).mapToInt(Integer::valueOf).toArray();}protected long[]lineToLongArray()throws IOException{return Arrays.stream(sc.nextLine().trim().split("\\s+")).mapToLong(Long::valueOf).toArray();}protected String intArrayToString(final int[]a){return Arrays.stream(a).mapToObj(Integer::toString).collect(Collectors.joining(" "));}protected String longArrayToString(final long[]a){return Arrays.stream(a).mapToObj(Long::toString).collect(Collectors.joining(" "));}protected List<Long>longArrayToList(final long[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected List<Integer>intArrayToList(final int[]a){returnArrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.toList());}protectedList<Long>intArrayToLongList(final int[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}protected void run()throws IOException{boolean done=false;if(nameIn !=null){try{try(FileInputStream fis=new FileInputStream(nameIn);PrintWriter pw0=select_output();){done=true;sc=new Scanner(fis);pw=pw0;process();}}catch(IOException ex){}}if(!done){try(PrintWriter pw0=select_output();){sc=new Scanner(System.in);pw=pw0;process();}}}private PrintWriter select_output()throws FileNotFoundException{if(nameOut !=null){return new PrintWriter(nameOut);}return new PrintWriter(System.out);}}//end net/leksi/contest/Solver.java}