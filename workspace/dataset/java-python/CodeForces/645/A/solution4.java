import java.io.*; public class Main {    public static void main(String[] args) {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        OutputStream output = System.out;        PrintWriter pr = new PrintWriter(output);        try {            String line1 = br.readLine();            StringBuilder sb = new StringBuilder(br.readLine());            line1 += sb.reverse();            line1 = line1.replace("X", "");            String line2 = br.readLine();            sb = new StringBuilder(br.readLine());            line2 += sb.reverse();            line2 = line2.replace("X", "");             pr.println((line1 + line1).contains(line2) ? "YES" : "NO");            pr.close();                    } catch (IOException e) {            e.printStackTrace();        }    }}
