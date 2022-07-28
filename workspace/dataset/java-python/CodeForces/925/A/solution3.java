import java.io.*;import java.util.*;import java.math.*; public class StairsElevators {     static class InputReader {        BufferedReader reader;        StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }         String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public double nextDouble() {            return Double.parseDouble(next());        }    }     static InputReader r = new InputReader(System.in);    static PrintWriter pw = new PrintWriter(System.out);     public static void main(String[] args) {               long n = r.nextInt(); // #floors       long m = r.nextInt(); // #sections/floor       long ns = r.nextInt(); // # stairs       long ne = r.nextInt(); // # elevators       long v = r.nextInt(); // elevator speed       long[] stairs = new long[(int)ns+2];        stairs[0] = Long.MIN_VALUE / 100;        stairs[(int)ns+1] = Long.MAX_VALUE / 100;        for(int i = 1; i <= ns; i++){stairs[i] = r.nextInt();}       long[] elevators = new long[(int)ne+2];        elevators[0] = Long.MIN_VALUE / 100;        elevators[(int)ne+1] = Long.MAX_VALUE / 100;        for(int i = 1; i <= ne; i++){elevators[i] = r.nextInt();}        long queries = r.nextInt();        for(int q = 1; q <= queries; q++){           long x1 = r.nextInt(); // x is floor, y is section           long y1 = r.nextInt();           long x2 = r.nextInt();           long y2 = r.nextInt();            long LE, RE, LS, RS; // left elev, right elev, left stairs, right stairs           long bss = Arrays.binarySearch(stairs, y1);           long bse = Arrays.binarySearch(elevators, y1);            if(bss < 0){                bss = -bss-1;            } if (bse < 0){                bse = -bse-1;            }            // left is bs-1, right is bs position            LE = Math.abs(y1-elevators[(int)bse-1]) + (int)Math.ceil((1.0 * Math.abs(x1-x2) / v)) + Math.abs(y2-elevators[(int)bse-1]);            RE = Math.abs(y1-elevators[(int)bse])   + (int)Math.ceil((1.0 * Math.abs(x1-x2) / v)) + Math.abs(y2-elevators[(int)bse]);            LS = Math.abs(y1-stairs[(int)bss-1])    + Math.abs(x1-x2)                             + Math.abs(y2-stairs[(int)bss-1]);            RS = Math.abs(y1-stairs[(int)bss])      + Math.abs(x1-x2)                             + Math.abs(y2-stairs[(int)bss]);             /*            System.out.println(" (S)" + stairs[(int)bss-1] + " " + stairs[(int)bss] + " (E)" + elevators[(int)bse-1] + " " + elevators[(int)bse]);            System.out.println(" LE" + LE + " RE" + RE + " LS" + LS + " RS" + RS);             System.out.println(Math.abs(y1-elevators[(int)bse])   + " " + (int)Math.ceil((1.0 * Math.abs(x1-x2) / v)) + " " + Math.abs(y2-elevators[(int)bse]));            System.out.println(y1-stairs[(int)bss]       + " " + Math.abs(x1-x2)                             + " " + Math.abs(y2-stairs[(int)bss]));             System.out.println(y1 + " " + stairs[(int)bss-1]);            System.out.println(Math.abs(y1-stairs[(int)bss-1])    + " " + Math.abs(x1-x2)                             +" " +  Math.abs(y2-stairs[(int)bss-1]));            */            if(x1 == x2){                pw.println(Math.abs(y1-y2));            } else{                pw.println(Math.min(Math.min(LE, RE), Math.min(LS, RS)));            }        }           pw.close();    }} /***                _        _                 _                                                *               | |      | |               | |                                               *   ___ ___   __| | ___  | |__  _   _    __| | __ _ _ __ _ __ ___ _ __     _   _  __ _  ___  *  / __/ _ \ / _` |/ _ \ | '_ \| | | |  / _` |/ _` | '__| '__/ _ \ '_ \   | | | |/ _` |/ _ \ * | (_| (_) | (_| |  __/ | |_) | |_| | | (_| | (_| | |  | | |  __/ | | |  | |_| | (_| | (_) |*  \___\___/ \__,_|\___| |_.__/ \__, |  \__,_|\__,_|_|  |_|  \___|_| |_|   \__, |\__,_|\___/ *                                __/ |                               ______ __/ |            *  */
