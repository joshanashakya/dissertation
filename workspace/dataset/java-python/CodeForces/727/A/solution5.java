//import javafx.util.Pair; import java.io.*;import java.util.*; public class GeOlymp{      static ArrayList<Long> pathDfs;     public static boolean dfs(long a, long b){        if(a == b) {            return true;        } else if( a > b) {           return false;        }        boolean result1 = dfs(a*2, b);        if(result1) {            pathDfs.add(a*2);            return true;        }        boolean result2 = dfs(10*a+1, b);        if(result2){            pathDfs.add(10*a+1);            return true;        }        return false;    }      public static void main(String[] args) throws FileNotFoundException {         //Scanner scn = new Scanner(new File("/home/bubu/Bubu/MACS/OOP/exam/src/sum.in"));         //PrintWriter out = new PrintWriter(new File("/home/bubu/Bubu/MACS/OOP/exam/src/sum.out"));         //Scanner scn = new Scanner(new File("forcycle.in"));         //PrintWriter out = new PrintWriter(new File("forcycle.out"));         /*long n = scn.nextLong();         long m = scn.nextLong();         long tots = (m*(m+1))/2 - 1;         long result = tots*(n/m) + ((n%m)*((n%m)+1))/2;*/         //out.println(result);         //out.close();          Scanner sc = new Scanner(System.in);         PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));          long a = sc.nextInt(); //         long b = sc.nextInt(); //         pathDfs = new ArrayList<>();         boolean possible = dfs(a, b);         if(!possible){             out.println("NO");         } else {             out.println("YES");             out.println(pathDfs.size()+1);             Collections.reverse(pathDfs);             out.print(a + " ");            for(int i=0;i<pathDfs.size();i++){                out.print(pathDfs.get(i)); //??                if(i!=pathDfs.size()-1) out.print(" ");            }         }          out.close();     }     static class Triplet{        int first;        int second;        int third;        public Triplet(int a, int b, int c){            first=a;            second=b;            third = c;        }    }     static class Pair{        Object x;        boolean y;        public Pair(Object a, boolean b){            x=a;            y=b;        }    }}
