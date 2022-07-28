import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; /** * 250B * θ(n) time * θ(n) space * * @author artyom */public class _250B implements Runnable {    private BufferedReader in;     private Object solve() throws IOException {        StringBuilder sb = new StringBuilder();        for (int i = 0, n = nextInt(); i < n; i++) {            String[] s = nextToken().split(":", -1);            int k = 0, m = s.length - 1;            if (s[k].isEmpty()) {                k++;            }            if (s[m].isEmpty()) {                m--;            }            for (int j = k; j <= m; j++) {                if (s[j].isEmpty()) {                    for (int l = 1, lim = 8 - m + k; l <= lim; l++) {                        sb.append("0000");                        if (l < lim) {                            sb.append(':');                        }                    }                } else {                    for (int l = s[j].length(); l < 4; l++) {                        sb.append('0');                    }                    sb.append(s[j]);                }                if (j < m) {                    sb.append(':');                }            }            sb.append('\n');        }        return sb;    }     //--------------------------------------------------------------    public static void main(String[] args) {        new _250B().run();    }     @Override    public void run() {        try {            in = new BufferedReader(new InputStreamReader(System.in));            System.out.print(solve());            in.close();        } catch (IOException e) {            System.exit(0);        }    }     private String nextToken() throws IOException {        return in.readLine();    }     private int nextInt() throws IOException {        return Integer.parseInt(nextToken());    }}
