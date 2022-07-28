import java.io.*;
import java.util.StringTokenizer;

/**
 * 95A
 * O(n*|w|^2) time
 * θ(Σ(|si|) + |w|) space
 *
 * @author artyom
 */
public class _95A implements Runnable {
    private BufferedReader in;
    private StringTokenizer tok;

    private Object solve() throws IOException {
        int n = nextInt();
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = nextToken().toLowerCase();
        }

        String w = nextToken(), lcw = w.toLowerCase();
        int l = w.length();
        boolean[] bv = new boolean[l];
        for (int i = 0; i < n; i++) {
            int m = ss[i].length();
            out:
            for (int j = 0, lim = l - m; j <= lim; j++) {
                for (int k = 0; k < m; k++) {
                    if (ss[i].charAt(k) != lcw.charAt(j + k)) {
                        continue out;
                    }
                }
                for (int k = 0; k < m; k++) {
                    bv[j + k] = true;
                }
            }
        }

        char t = nextToken().charAt(0), r = t == 'a' ? 'b' : 'a';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            if (bv[i]) {
                char h = lcw.charAt(i) == t ? r : t;
                if (Character.isUpperCase(w.charAt(i))) {
                    h = Character.toUpperCase(h);
                }
                sb.append(h);
            } else {
                sb.append(w.charAt(i));
            }
        }
        return sb;
    }

    //--------------------------------------------------------------
    public static void main(String[] args) {
        new _95A().run();
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            tok = null;
            PrintStream out = System.out;
            out.print(solve());
            in.close();
        } catch (IOException e) {
            System.exit(0);
        }
    }

    private String nextToken() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    private int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
}
