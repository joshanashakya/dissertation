import java.io.*;import java.util.Arrays; public class Main {    private StreamTokenizer x;    private PrintWriter out;     private String berzek[][];    private int z;    private int sets[][];     int nextInt() throws IOException {        x.nextToken();        return (int)x.nval;    }     public static void main(String[] args) throws IOException {        new Main().run();    }     void run() throws IOException {        x = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));        out = new PrintWriter(new OutputStreamWriter(System.out));        solve();        out.flush();    }     void simulate_all() {        final String WIN = "Win ";        final String LOSE = "Lose ";        final String LOOP = "Loop ";        boolean changed = true;        int i,j;         Arrays.fill(berzek[0], LOOP);        Arrays.fill(berzek[1], LOOP);         for (i = 0; i < 2; i++) {            for (int e : sets[i]) {                berzek[i][z - e] = WIN;            }        }        while (changed) {        changed = false;        for (i = z - 1; i > 0; i--) {        for (j = 0; j < 2; j++) {            if (berzek[j][i] == LOOP) {                boolean win = false;                boolean loop = false;            for (int e : sets[j]) {                int idx = (i + e) % z;                if (berzek[1-j][idx] == LOSE) {                    win = true;                    break;                } else if (berzek[1-j][idx] != WIN) {                    loop = true;                }                }             if (win) {                changed = true;                berzek[j][i] = WIN;            } else if (!loop) {                changed = true;                berzek[j][i] = LOSE;            }        }        }}    }    }     void solve() throws IOException {        int i;        z = nextInt();        int w = nextInt();        sets = new int[2][];        sets[0] = new int[w];        for (i = 0; i < w; i++) {            sets[0][i] = nextInt();        }        int y = nextInt();        sets[1] = new int[y];        for (i = 0; i < y; i++) {            sets[1][i] = nextInt();        }        berzek = new String[2][];        berzek[0] = new String[z];        berzek[1] = new String[z];         simulate_all();         StringBuilder ber1 = new StringBuilder();        StringBuilder ber2 = new StringBuilder();         for (i = 1; i < z; i++) {            ber1.append(berzek[0][i]);            ber2.append(berzek[1][i]);        }         out.println(ber1.toString());        out.println(ber2.toString());    }}
