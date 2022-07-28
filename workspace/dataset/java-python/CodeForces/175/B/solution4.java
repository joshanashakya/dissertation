import java.io.*;import java.lang.reflect.Array;import java.security.cert.TrustAnchor;import java.util.*; /** * Created by noureldin on 2/20/17. */ public class main {      public static void main(String[] args) throws Exception{        IO io = new IO(null,null);        HashMap<String,Integer> HM = new HashMap<>();        int n = io.getNextInt();        for (int i = 0;i < n;i++){            String name = io.getNext();            int score = io.getNextInt();            if(!HM.containsKey(name)) HM.put(name,0);            HM.put(name,Math.max(score,HM.get(name)));        }        person [] A = new person[HM.size()];        int m = 0;        for (String k : HM.keySet()) A[m++] = new person(k,HM.get(k));        Arrays.sort(A);        String [] verdict = {"noob","random","average","hardcore","pro"};        int [] percent = {0,50,80,90,99,101};        int cur = 0;        io.println(m);        for (int i = 0;i < m;){            int j = i;            while (j < m && A[i].score == A[j].score) j++;            while (j*100 >= m*percent[cur + 1]) cur++;             for (;i < j;i++) io.println(A[i].name + " " + verdict[cur]);        }        io.close();    }}  class person implements Comparable<person>{    String name;    int score;    public person(String name,int score){        this.name = name;        this.score = score;    }    @Override    public int compareTo(person o){        return this.score - o.score;    }} class IO{    private BufferedReader br;    private StringTokenizer st;    private PrintWriter writer;    private String inputFile,outputFile;     public String getNext() throws FileNotFoundException, IOException{        while(st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());        return st.nextToken();    }     public String getNextLine() throws FileNotFoundException, IOException{        return br.readLine();    }     public int getNextInt() throws FileNotFoundException, IOException{        return Integer.parseInt(getNext());    }    public long getNextLong() throws FileNotFoundException, IOException{        return Long.parseLong(getNext());    }     public void print(double x,int num_digits) throws  IOException{        writer.printf("%." + num_digits + "f" ,x);    }    public void println(double x,int num_digits) throws  IOException{        writer.printf("%." + num_digits + "f\n" ,x);    }    public void print(Object o) throws  IOException{        writer.print(o.toString());    }     public void println(Object o) throws  IOException{        writer.println(o.toString());    }    public IO(String x,String y) throws FileNotFoundException, IOException{        inputFile = x;        outputFile = y;        if(x != null) br = new BufferedReader(new FileReader(inputFile));        else br = new BufferedReader(new InputStreamReader(System.in));        if(y != null) writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));        else writer = new PrintWriter(new OutputStreamWriter(System.out));    }     protected void close() throws IOException{        br.close();        writer.close();    }} 