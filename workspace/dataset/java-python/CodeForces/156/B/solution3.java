// Name: Patrick Inglesby// Date: // Description:  import java.util.*;import java.io.*; public class Main {     public static void main(String[] args) throws Exception {        in.init(System.in);        PrintWriter out = new PrintWriter(System.out);        int numSuspects = in.nextInt();        int numTruths = in.nextInt();        int[] thePositiveBoys = new int[numSuspects+1];        int[] theNegativeBoys = new int[numSuspects+1];        int[] guiltyBoys = new int[numSuspects];        // if true they are possibly guilty        boolean[] possiblyGuilty = new boolean[numSuspects+1];        int totalBlamed = 0;        int totalNotBlamed = 0;        int numberOfGuysThatCouldBeKillersButAlsoMayNotBeKillersIfThisParticularVariableIsGreaterThanOne = 0;                for (int i = 0; i < numSuspects; i++) {            guiltyBoys[i] = in.nextInt();            if (guiltyBoys[i] > 0) {                thePositiveBoys[guiltyBoys[i]]++;                totalBlamed++;            }            else {                theNegativeBoys[-guiltyBoys[i]]++;                totalNotBlamed++;            }        }                for (int i = 1; i <= numSuspects; i++) {            if (thePositiveBoys[i] + totalNotBlamed - theNegativeBoys[i] == numTruths) {                possiblyGuilty[i] = true;                numberOfGuysThatCouldBeKillersButAlsoMayNotBeKillersIfThisParticularVariableIsGreaterThanOne++;            }        }                for (int i = 0; i < numSuspects; i++) {            if (guiltyBoys[i] > 0) {                if (possiblyGuilty[guiltyBoys[i]] && numberOfGuysThatCouldBeKillersButAlsoMayNotBeKillersIfThisParticularVariableIsGreaterThanOne == 1) {                    out.println("Truth");                }                else if (!possiblyGuilty[guiltyBoys[i]]) {                    out.println("Lie");                }                else {                    out.println("Not defined");                }            }            else {                if (possiblyGuilty[-guiltyBoys[i]] && numberOfGuysThatCouldBeKillersButAlsoMayNotBeKillersIfThisParticularVariableIsGreaterThanOne == 1) {                    out.println("Lie");                }                else if (!possiblyGuilty[-guiltyBoys[i]]) {                    out.println("Truth");                }                else {                    out.println("Not defined");                }            }        }        out.close();    } // END Main() } class in {     static BufferedReader reader;    static StringTokenizer tokenizer;        static void init(InputStream input) {        reader = new BufferedReader(new InputStreamReader(input));        tokenizer = new StringTokenizer("");    }        static String next() throws IOException {        while (!tokenizer.hasMoreTokens()) {            tokenizer = new StringTokenizer(reader.readLine());        }        return tokenizer.nextToken();    }        static int nextInt() throws IOException {        return Integer.parseInt(next());    }        static double nextDouble() throws IOException {        return Double.parseDouble(next());    }}