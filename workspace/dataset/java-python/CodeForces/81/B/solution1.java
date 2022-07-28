import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Scanner; /** * Built using CHelper plug-in * Actual solution is at the top * * @author Mouna Cheikhna */public class Main {    public static void main(String[] args) {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB {        public void solve(int testNumber, Scanner in, PrintWriter out) {            String s = in.nextLine();             s = s.replaceAll(" {2,}", " ") // replace 2 or more spaces by one                    .replaceAll(" ,", ",") // replace space before comma by just comma                    .replaceAll(", ", ",") // replace space after comma with comma                    .replaceAll(",", ", ") // replace all commas with comma then a space                    .replaceAll(" \\.\\.\\.", "...") // replace all space then three dots with three dots                    .replaceAll("\\.\\.\\. ", "...") // replace all three dots then space with three dots                    .replaceAll("\\.\\.\\.", " ...") // replace all three dots with three dots then space                    .trim(); // remove all other spaces             out.println(s);        }     }} 