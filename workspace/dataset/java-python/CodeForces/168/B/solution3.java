import java.io.IOException;import java.util.Scanner; /** * 168B * θ(|text|) time * O(|text|) space * * @author artyom */public class _168B implements Runnable {    private Object solve() throws IOException {        Scanner sc = new Scanner(System.in);        StringBuilder sb = new StringBuilder(), line = new StringBuilder();        boolean f = false;        while (sc.hasNextLine()) {            String s = sc.nextLine(), t = s.replaceAll("\\s+", "");            if (!t.isEmpty() && t.charAt(0) == '#') {                if (f) {                    sb.append(line).append('\n');                }                sb.append(s);                //if (sc.hasNextLine()) {                    sb.append('\n');                //}                line = new StringBuilder();                f = false;            } else {                line.append(t);                f = true;            }        }        if (f) {            sb.append(line);            //if (line.length() == 0) {                sb.append('\n');            //}        }        return sb;    }     //--------------------------------------------------------------    public static void main(String[] args) {        new _168B().run();    }     @Override    public void run() {        try {            System.out.print(solve());        } catch (IOException e) {            System.exit(0);        }    }}