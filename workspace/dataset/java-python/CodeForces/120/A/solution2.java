import java.util.*;import java.io.*; public class A_Elevator {     public static void main(String[] args) throws Exception {         Scanner in = new Scanner(new File("input.txt"));         PrintWriter pw = new PrintWriter(new File("output.txt"));       // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));          String s = in.nextLine();        int n = Integer.parseInt(in.nextLine());        if (s.equals("front") && n == 1) {            pw.append("L\n");        } else if (s.equals("front") && n == 2) {            pw.append("R\n");        } else if (s.equals("back") && n == 1) {            pw.append("R\n");        } else if (s.equals("back") && n == 2) {            pw.append("L\n");        }        pw.close();           }}